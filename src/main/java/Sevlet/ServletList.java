package Sevlet;

import Model.Cust;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Sevlet.ServletList", value = "/getlist")
public class ServletList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Cust> Cust = new ArrayList<>();
        Cust.add(new Cust("Toan","1998/05/06", "Ha Noi", "/WebContent/images/images.png"));
        Cust.add(new Cust("ToanA","1998/05/06", "Ha Noi", "/WebContent/images/images.png"));
        Cust.add(new Cust("ToanB","1998/05/06", "Ha Noi", "/images/images.png"));
        Cust.add(new Cust("ToanC","1998/05/06", "Ha Noi", "/images/images.png"));
        request.setAttribute("Cust",Cust);
        RequestDispatcher rq = request.getRequestDispatcher("show.jsp");
        rq.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
