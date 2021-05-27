
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "CustomerServlet",urlPatterns ="")
public class ShowInformationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer(1, "Nguyen Phuong Nam", "22-12-1999", "Da Nang", "anh1.jpg");
        Customer customer2 = new Customer(2, "Phan Gia Khanh", "22-10-1990", "Lao Cai", "anh2.jpg");
        Customer customer3 = new Customer(3, "Dao Phuong Thao", "10-10-1993", "Bac Ninh", "anh3.jpg");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        request.setAttribute("customerList", customerList);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}