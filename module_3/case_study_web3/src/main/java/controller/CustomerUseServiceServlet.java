package controller;

import model.bean.contract.Contract;
import model.bean.customer.Customer;
import model.bean.employee.Employee;
import model.bean.service.Service;
import model.bean.view_customer.CustomerUserService;
import model.service.impl.*;
import model.service.interfacee.IContractService;
import model.service.interfacee.IService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerUseServiceServlet",urlPatterns = {"/userService",""})
public class CustomerUseServiceServlet extends HttpServlet {
    IService customerUseServiceService=new CustomerUserServiceImpl();
    IService customerService=new CustomerServiceImpl();
    IService employeeService=new EmployeeServiceImpl();
    IContractService contractService=new ContractServiceImpl();
    IService serviceService=new ServiceServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                edit(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;

            case "search":
                search(request, response);
                break;
            default:
                showCustomerUseService(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                showEdit(request, response);
                break;
            default:
                showCustomerUseService(request, response);
                break;
        }
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) {

        int id = Integer.parseInt(request.getParameter("contractId"));
        Contract contract= contractService.findById(id);
        List<Customer> customers=customerService.findAll();
        List<Employee> employees=employeeService.findAll();
        List<Service> services=serviceService.findAll();
        request.setAttribute("customers", customers);
        request.setAttribute("services", services);
        request.setAttribute("employees", employees);
        request.setAttribute("contract", contract);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("view/customerUseService/edit.jsp");


        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void edit(HttpServletRequest request, HttpServletResponse response) {
        int contractId = Integer.parseInt(request.getParameter("contractId"));
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int serviceId = Integer.parseInt(request.getParameter("serviceId"));
        String contractStartDate = request.getParameter("contractStartDate");
        String contractEndDate = request.getParameter("contractEndDate");
        int deposit = Integer.parseInt(request.getParameter("deposit"));
        int total = Integer.parseInt(request.getParameter("total"));

        Contract  contract=new Contract(contractId,employeeId,customerId,serviceId,contractStartDate,contractEndDate,deposit,total);
        contractService.update(contract);
        request.setAttribute("message","da sua thanh cong");

        request.setAttribute("conTract",contract);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/customerUseService/edit.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("contractId"));
        customerUseServiceService.remove(id);
        List<CustomerUserService> customerUseServices = this.customerUseServiceService.findAll();
        request.setAttribute("customerUseServices", customerUseServices);
        RequestDispatcher requestDispatcher=null ;
        if(customerUseServices==null){
            requestDispatcher=request.getRequestDispatcher("error-404");
        }else {
            boolean check=this.customerUseServiceService.remove(id);
            String message=null;
            if(check){
                message="xoa thanh cong";
            }else {
                message="xoa khong thanh cong";
            }
            listCustomerUseService(request,response,message);
        }
    }

    private void listCustomerUseService(HttpServletRequest request, HttpServletResponse response, String message) {

        List<CustomerUserService> customerUseService=this.customerUseServiceService.findAll();
        request.setAttribute("message",message);
        request.setAttribute("customerUseServices",customerUseService);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/customerUseService/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomerUseService(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerUserService> customerUseServices=this.customerUseServiceService.findAll();


        request.setAttribute("customerUseServices",customerUseServices);



        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/customerUseService/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("tim");
        List<CustomerUserService> customerUseServices=this.customerUseServiceService.findByName(name);

        request.setAttribute("customerUseServices",customerUseServices);

        RequestDispatcher requestDispatcher=request.getRequestDispatcher("view/customerUseService/list.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}