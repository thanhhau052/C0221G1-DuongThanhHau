
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Calculator", urlPatterns = "/result")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double firstOperand = Double.parseDouble(request.getParameter("first"));
        String operand = request.getParameter("operand");
//        toán hạng
        Double secondOperand = Double.parseDouble(request.getParameter("second"));

        Double result=0d;

        switch (operand) {
            case "+":
                result = firstOperand + secondOperand;
                break;

            case "-":
                result = firstOperand - secondOperand;
                break;

            case "*":
                result = firstOperand * secondOperand;
                break;

            case "/":
                result = firstOperand / secondOperand;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + operand);
        }
        request.setAttribute("result", result);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(request,response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}