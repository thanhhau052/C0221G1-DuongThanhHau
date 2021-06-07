package controller;

import model.bean.contract.Contract;
import model.bean.customer.Customer;
import model.bean.employee.Employee;
import model.bean.service.Service;

import model.repository.CustomerRepository;
import model.repository.EmployeeRepository;
import model.repository.ServiceRepository;
import model.service.interfacee.IContractService;
import model.service.impl.ContractServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contracts")
public class ContractServlet extends HttpServlet {
    IContractService iContractService = new ContractServiceImpl();
    List<Service> services = new ServiceRepository().findAll();
    List<Employee> employees = new EmployeeRepository().findAll();
    List<Customer> customers = new CustomerRepository().findAll();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createContract(request, response);
                break;
        }


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        showFormCreateContract(request, response);

    }


    private void createContract(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        int customerId = Integer.parseInt(request.getParameter("customerId"));
        int serviceId = Integer.parseInt(request.getParameter("serviceId"));
        String contractStartDate = request.getParameter("contractStartDate");
        String contractEndDate = request.getParameter("contractEndDate");
        int contractDeposit = Integer.parseInt(request.getParameter("deposit"));
        int contractTotal = Integer.parseInt(request.getParameter("contractTotal"));
        Contract contract = new Contract(employeeId, customerId, serviceId, contractStartDate, contractEndDate,
                contractDeposit, contractTotal);
        //     private int contractId;
        //    private int employeeId;
        //    private int customerId;
        //    private int serviceId;
        //    private String contractStartDate;
        //    private String contractEndDate;
        //    private int contractDeposit;
        //    private int contractTotal;
        request.setAttribute("message", "Create contract is success");
        request.setAttribute("services", services);
        request.setAttribute("employees", employees);
        request.setAttribute("customers", customers);
        try {
            request.getRequestDispatcher("/view/contract/create.jsp").forward(request, response);
            iContractService.createContract(contract);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    private void showFormCreateContract(HttpServletRequest request, HttpServletResponse response) {

        request.setAttribute("services", services);
        request.setAttribute("employees", employees);
        request.setAttribute("customers", customers);
        try {
            request.getRequestDispatcher("/view/contract/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}