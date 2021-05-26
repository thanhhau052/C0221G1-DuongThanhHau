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

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h3> Product Description " + description + "</h3>");
        writer.println("<h3> List Price " + price + "</h3>");
        writer.println("<h3> Discount Percent " + percent + "</h3>");
        writer.println("-------------------------------------------");
        writer.println("<h3> Discount Amount " + discountamount + "</h3>");
        writer.println("<h3> Discount Price " + discountprice + "</h3>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}