package controller;

import model.bean.customer.Customer;
import model.bean.customer.CustomerType;
import model.service.impl.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customers"})
public class CustomerServlet extends HttpServlet {
    private CustomerServiceImpl customerService;
    private List<CustomerType> customerTypes ;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerServiceImpl();
        customerTypes = customerService.findAllCustomerType();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                updateCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            case "search":
                searchCustomer(request, response);
            default:
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateFrom(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "view":
                viewCustomer(request, response);
                break;
            default:
                listCustomers(request, response,null);
                break;
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response, String message) {
        List<Customer> customer = this.customerService.findAll();
        request.setAttribute("message",message);
        request.setAttribute("customers", customer);
        request.setAttribute("customerTypes", customerTypes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateFrom(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("customerTypes", customerTypes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        int customer_type_id = Integer.parseInt(request.getParameter("customer_type_id"));
        String customer_name = request.getParameter("customer_name");
        String customer_birthday = String.valueOf(request.getParameter("customer_birthday"));
        String customer_gender = request.getParameter("customer_gender");
        String customer_id_card = request.getParameter("customer_id_card");
        String customer_phone = request.getParameter("customer_phone");
        String customer_email = request.getParameter("customer_email");
        String customer_address = request.getParameter("customer_address");
        Customer customer = new Customer(customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address);
        this.customerService.save(customer);
        request.setAttribute("message","New customer was created");
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/create.jsp");
        request.setAttribute("customerTypes", customerTypes);
        try{
            dispatcher.forward(request, response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    private void showEditForm(HttpServletRequest request, HttpServletResponse response){
        int customer_id = Integer.parseInt(request.getParameter("customer_id"));
        Customer customer = (Customer) this.customerService.findById(customer_id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/edit.jsp");
        request.setAttribute("customer",customer);
        request.setAttribute("customerTypes", customerTypes);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void updateCustomer(HttpServletRequest request, HttpServletResponse response){
        int customer_id = Integer.parseInt(request.getParameter("customer_id"));
        Customer customer = this.customerService.findById(customer_id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        else {
            customer.setCustomerTypeId(Integer.parseInt(request.getParameter("customer_type_id")));
            customer.setCustomerName(request.getParameter("customer_name"));
            customer.setCustomerBirthday(String.valueOf(request.getParameter("customer_birthday")));
            customer.setCustomerGender(request.getParameter("customer_gender"));
            customer.setCustomerIdCard( request.getParameter("customer_id_card"));
            customer.setCustomerPhone(request.getParameter("customer_phone"));
            customer.setCustomerEmail(request.getParameter("customer_email"));
            customer.setCustomerAddress(request.getParameter("customer_address"));
            this.customerService.update(customer_id, customer);
            request.setAttribute("message","Customer information was updated");
            request.setAttribute("customer", customer);
            request.setAttribute("customerTypes", customerTypes);

            dispatcher =request.getRequestDispatcher("view/customer/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response){
        int customer_id = Integer.parseInt(request.getParameter("customer_id"));
        Customer customer =  this.customerService.findById(customer_id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else{
            boolean check = this.customerService.remove(customer_id);
            String message;
            if(check){
                message ="thanh cong";
            }else {
                message = "that bai";
            }
            listCustomers(request,response,message);
        }
    }
    private void viewCustomer(HttpServletRequest request, HttpServletResponse response){
        int customer_id = Integer.parseInt(request.getParameter("customer_id"));
        Customer customer = (Customer) this.customerService.findById(customer_id);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("customer", customer);
            request.setAttribute("customerTypes", customerTypes);
            dispatcher = request.getRequestDispatcher("view/customer/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void searchCustomer(HttpServletRequest request, HttpServletResponse response){
        String customer_name =  request.getParameter("customer_name");
        List<Customer> customers = this.customerService.findByName(customer_name);
        request.setAttribute("customers",customers);
        request.setAttribute("customerTypes", customerTypes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customer/list.jsp");
        try{
            dispatcher.forward(request, response);
        }catch (ServletException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}