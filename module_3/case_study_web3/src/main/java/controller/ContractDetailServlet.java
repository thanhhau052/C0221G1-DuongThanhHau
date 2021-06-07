package controller;

import model.bean.contract.AttachService;
import model.bean.contract.Contract;
import model.bean.contract.ContractDetail;
import model.repository.ContractRepository;
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

@WebServlet(name = "ContractDetailServlet",urlPatterns = "/contractDetails")
public class ContractDetailServlet extends HttpServlet {
    List<Contract> contracts = new ContractRepository().findByAllContract();
    List<AttachService> attachServices = new ContractRepository().findByAllAttachService();


    IContractService iContractService = new ContractServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create" :  createContractDetail(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        showFormCreateContractDetail(request, response);

    }
    private void createContractDetail(HttpServletRequest request, HttpServletResponse response) {
        int contractId = Integer.parseInt(request.getParameter("contractId"));
        int attachServiceId = Integer.parseInt(request.getParameter("attachServiceId"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        ContractDetail contractDetail = new ContractDetail(contractId, attachServiceId, quantity);
        request.setAttribute("contracts", contracts);
        request.setAttribute("attachServices", attachServices);
        request.setAttribute("message", "Create Contract Detail is success");
        try {
            iContractService.createContractDetail(contractDetail);
            request.getRequestDispatcher("/view/contract_detail/create.jsp").forward(request, response);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void showFormCreateContractDetail(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("contracts", contracts);
        request.setAttribute("attachServices", attachServices);
        try {
            request.getRequestDispatcher("/view/contract_detail/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}