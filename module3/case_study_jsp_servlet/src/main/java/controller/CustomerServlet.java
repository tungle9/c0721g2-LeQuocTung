package controller;

import responsitory.CustomerRepository;
import model.Customer;
import until.Validate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private CustomerRepository listCustomers;

    public void init() {
        listCustomers = new CustomerRepository();
    }

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> listCustomer = listCustomers.findAll();
        request.setAttribute("listCustomer", listCustomer);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void insertCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        boolean flag = false;

        String nameError = "";
        int id = Integer.parseInt(request.getParameter("id"));


        String name = request.getParameter("name");
        if(Validate.checkRegex(name,Validate.NAME_REGEX)){
            flag = true ;
            nameError = "Format name pls enter again VD Tung le.v.v.v.";
        }


        String email = request.getParameter("email");
        String birthday = request.getParameter("birthday");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String idCard = request.getParameter("idCard");

        Customer customer = new Customer(id, name, email, birthday, phone, idCard);
        listCustomers.insertCustomer(customer);

        if(flag){
            request.setAttribute("nameError",nameError);
            request.setAttribute("customer",customer);
            showCreateForm(request,response);
        }


        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        request.setAttribute("message", "New customer was created");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        listCustomers.deleteCustomer(id);
        List<Customer> listCustomer = listCustomers.findAll();
        request.setAttribute("listCustomer", listCustomer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/list.jsp");
        dispatcher.forward(request, response);
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String birthday = request.getParameter("birthday");
        int phone = Integer.parseInt(request.getParameter("phone"));
        String idCard = request.getParameter("idCard");

        Customer customer = new Customer(id, name, email, birthday, phone, idCard);
        listCustomers.update(customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit.jsp");
        request.setAttribute("message", "Updated complete");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // chuyển dữ liệu
        int id = Integer.parseInt(request.getParameter("id"));
         Customer exsting = listCustomers.select(id);
        // chuyển hướng
        RequestDispatcher dispatcher = request.getRequestDispatcher("customer/edit.jsp");
          request.setAttribute("customer", exsting);
        dispatcher.forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    insertCustomer(request, response);
                    break;
                case "edit":
                    updateCustomer(request, response);
                    listCustomer(request, response);
                    break;
                case "view":
                    break;
                default:
                    listCustomer(request, response);
                    break;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "create":
                    showCreateForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    deleteCustomer(request, response);
                    break;
                case "view":
                    break;
                default:
                    listCustomer(request, response);
                    break;
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
