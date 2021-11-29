import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "ProductDiscountCalculatorServlet",value = "/result")
public class ProductDiscountCalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double pri = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("dp"));
        double result = pri * percent * 0.01 ;



        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        double ketqua = pri * percent * 0.01 ;
        writer.println("Discount Amount : "+ketqua);
        writer.println("</html>");
        writer.println(result);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
