package controller;

import model.Service;
import responsitory.ServiceRepos;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    private ServiceRepos serviceRepos = new ServiceRepos();

    private void listService(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Service> listService = serviceRepos.selectAll();
        request.setAttribute("listService", listService);
        RequestDispatcher dispatcher = request.getRequestDispatcher("service/list.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("service/create.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String id = request.getParameter("id");
        Service existingService = serviceRepos.selectService(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("service/edit.jsp");
        request.setAttribute("service", existingService);
        dispatcher.forward(request, response);
    }

    private void insertService(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        //id, name, area, people, standardRoom, description
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String area = request.getParameter("area");
        String people = request.getParameter("people");
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("description");

        Service newService = new Service(id, name, area, people, standardRoom, description);

        serviceRepos.insertService(newService);
        RequestDispatcher dispatcher = request.getRequestDispatcher("service/create.jsp");
        request.setAttribute("message", "New customer was created");
        dispatcher.forward(request, response);
    }

    private void updateUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String area = request.getParameter("area");
        String people = request.getParameter("people");
        String standardRoom = request.getParameter("standardRoom");
        String description = request.getParameter("description");

        Service newService = new Service(id, name, area, people, standardRoom, description);

        serviceRepos.updateService(newService);

        RequestDispatcher dispatcher = request.getRequestDispatcher("service/edit.jsp");
        request.setAttribute("message", "Updated complete");
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
                    insertService(request, response);
                    break;
                case "edit":
                    updateUser(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
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
                    showNewForm(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "delete":
                    break;
                default:
                    listService(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }
}
