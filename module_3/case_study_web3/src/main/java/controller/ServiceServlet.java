package controller;

import model.bean.customer.CustomerType;
import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;
import model.service.impl.CustomerServiceImpl;
import model.service.impl.ServiceServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/services")
public class ServiceServlet extends HttpServlet {
    private ServiceServiceImpl serviceService;
    private List<ServiceType> serviceTypes;
    private List<RentType> rentTypes;

    @Override
    public void init() throws ServletException {
        serviceService = new ServiceServiceImpl();
        serviceTypes = serviceService.findAllServiceType();
        rentTypes = serviceService.findAllRentType();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createService(request, response);
                break;

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
                break;
            default:
                showCreateFrom(request, response);
                break;
        }
    }


    private void showCreateFrom(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("rentTypes", rentTypes);
        request.setAttribute("serviceTypes", serviceTypes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/service/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) {

        String service_name = request.getParameter("service_name");
        int service_area = Integer.parseInt(request.getParameter("service_area"));
        double service_cost = Double.parseDouble(request.getParameter("service_cost"));
        int service_max_people = Integer.parseInt(request.getParameter("service_max_people"));
        int rent_type_id = Integer.parseInt(request.getParameter("rent_type_id"));
        int service_type_id = Integer.parseInt(request.getParameter("service_type_id"));
        String standard_room = request.getParameter("standard_room");
        String description_other_convenience = request.getParameter("description_other_convenience");
        double pool_area = Double.parseDouble(request.getParameter("pool_area"));
        int number_of_floors = Integer.parseInt(request.getParameter("number_of_floors"));
        Service service = new Service( service_name, service_area, service_cost, service_max_people, rent_type_id, service_type_id, standard_room, description_other_convenience, pool_area, number_of_floors);
        this.serviceService.save(service);

        request.setAttribute("rentTypes", rentTypes);
        request.setAttribute("serviceTypes", serviceTypes);
        request.setAttribute("message", "New service was created!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/service/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
