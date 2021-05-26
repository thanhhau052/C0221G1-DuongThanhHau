import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "CalculatorServlet" , urlPatterns = "/index")


@WebServlet(name = "ConverterServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String  description= request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));

        double discountamount  = price * percent * 0.1;
        double discountprice = discountamount + price;

        request.setAttribute("description",description);
        request.setAttribute("discountamount",discountamount);
        request.setAttribute("discountprice",discountprice);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/display.jsp");
        dispatcher.forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}