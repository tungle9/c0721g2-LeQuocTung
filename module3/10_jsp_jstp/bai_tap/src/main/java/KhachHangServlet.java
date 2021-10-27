import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "KhachHangServlet",urlPatterns = {"","/khach_hang"})
public class KhachHangServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        List<KhachHang> khachHangs = new ArrayList<>();

        khachHangs.add(new KhachHang("Dragon boy","1983-08-20","Cali"));
        khachHangs.add(new KhachHang("Lee Nguyen","1990-04-21","TP HCM"));
        khachHangs.add(new KhachHang("David Teo","1997-10-20","Sa Dec"));
        khachHangs.add(new KhachHang("Dvkid Lee","2000-08-20","TP Da Nang"));

        request.setAttribute("KhachHangServlet",khachHangs);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
