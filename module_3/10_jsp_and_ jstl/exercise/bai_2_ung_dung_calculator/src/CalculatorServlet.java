
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
        try {

            Double firstOperand = Double.parseDouble(request.getParameter("first"));
            String operand = request.getParameter("operand");
//        toán hạng
            Double secondOperand = Double.parseDouble(request.getParameter("second"));

            Double result = 0d;

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
                    try {
                        if (secondOperand == 0) {
                            throw new Exception("Khong the chia cho 0");
                        }
                        result = firstOperand / secondOperand;

                    } catch (Exception e) {
                        request.setAttribute("result", e.getMessage());
                        request.getRequestDispatcher("result.jsp").forward(request, response);
                    }
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + operand);
            }

            request.setAttribute("result", result);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("result", e.getMessage());
            request.getRequestDispatcher("result.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


}