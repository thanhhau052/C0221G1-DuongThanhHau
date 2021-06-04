package controller;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;
import model.service.impl.EmployeeServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = {"/employees"})
public class EmployeeServlet extends HttpServlet {

    private EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private List<Position> positions= employeeService.findAllPosition();
    private List<EducationDegree> educationDegrees= employeeService.findAllEducationDegree();
    private List<Division> divisions = employeeService.findAllDivision();

//    @Override
//    public void init() throws ServletException {
//
//    }
//    employeeService
//    positions = employeeService.findAllPosition();
//    educationDegrees = employeeService.findAllEducationDegree();
//    divisions = employeeService.findAllDivision();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;
            case "edit":
                updateEmployee(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            case "search":
                searchEmployee(request, response);
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
                viewEmployee(request, response);
                break;
            default:
                listEmployee(request, response, null);
                break;
        }
    }

    private void listEmployee(HttpServletRequest request, HttpServletResponse response, String message) {
        List<Employee> employees = this.employeeService.findAll();
        request.setAttribute("employees", employees);
        request.setAttribute("positions", positions);
        request.setAttribute("educationDegrees", educationDegrees);
        request.setAttribute("divisions", divisions);
        request.setAttribute("message", message);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateFrom(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("positions", positions);
        request.setAttribute("educationDegrees", educationDegrees);
        request.setAttribute("divisions", divisions);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String employeeName = request.getParameter("employeeName");
        String employeeBirthday = String.valueOf(request.getParameter("employeeBirthday"));
        String employeeIdCard = request.getParameter("employeeIdCard");
        double employeeSalary = Double.parseDouble(request.getParameter("employeeSalary"));
        String employeePhone = request.getParameter("employeePhone");
        String employeeEmail = request.getParameter("employeeEmail");
        String employeeAddress = request.getParameter("employeeAddress");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String username = request.getParameter("username");

        //String employeeName, String employeeBirthday, String employeeIdCard, double employeeSalary, String employeePhone,
        // String employeeEmail, String employeeAddress, int positionId, int educationDegreeId, int divisionId, String username)

        Employee employee = new Employee( employeeName, employeeBirthday, employeeIdCard, employeeSalary, employeePhone, employeeEmail,
                                         employeeAddress, positionId, educationDegreeId, divisionId, username);
        boolean check = this.employeeService.save(employee);
        if(check){
            request.setAttribute("message", "New employee was created");
        }
        else {
            request.setAttribute("message", "Create new employee failed!!!");
        }
        request.setAttribute("positions", positions);
        request.setAttribute("educationDegrees", educationDegrees);
        request.setAttribute("divisions", divisions);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        Employee employee = this.employeeService.findById(employeeId);
        RequestDispatcher dispatcher;
        if (employee == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("employee", employee);
            request.setAttribute("positions", positions);
            request.setAttribute("educationDegrees", educationDegrees);
            request.setAttribute("divisions", divisions);
            dispatcher = request.getRequestDispatcher("view/employee/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        Employee employee = this.employeeService.findById(employeeId);
        RequestDispatcher dispatcher;
        if (employee == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            employee.setEmployeeName(request.getParameter("employeeName"));
            employee.setEmployeeBirthday(String.valueOf(request.getParameter("employeeBirthday")));
            employee.setEmployeeIdCard(request.getParameter("employeeIdCard"));
            employee.setEmployeeSalary(Double.parseDouble(request.getParameter("employeeSalary")));
            employee.setEmployeePhone(request.getParameter("employeePhone"));
            employee.setEmployeeEmail(request.getParameter("employeeEmail"));
            employee.setEmployeeAddress(request.getParameter("employeeAddress"));
            employee.setPositionId(Integer.parseInt(request.getParameter("positionId")));
            employee.setEducationDegreeId(Integer.parseInt(request.getParameter("educationDegreeId")));
            employee.setDivisionId(Integer.parseInt(request.getParameter("divisionId")));
            employee.setUsername(request.getParameter("username"));
            boolean check = this.employeeService.update(employeeId, employee);
            if(check){
                request.setAttribute("message", "Employee information was updated");
            }
            else {
                request.setAttribute("message", "Update employee information failed");
            }
            request.setAttribute("employee", employee);
            request.setAttribute("positions", positions);
            request.setAttribute("educationDegrees", educationDegrees);
            request.setAttribute("divisions", divisions);
            dispatcher = request.getRequestDispatcher("view/employee/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        boolean check = this.employeeService.remove(employeeId);
        String message;
        if (check) {
            message = "Success deleted customer";
        } else {
            message = "Deleted customer fail";
        }
        listEmployee(request, response, message);
    }

    private void viewEmployee(HttpServletRequest request, HttpServletResponse response) {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        Employee employee = this.employeeService.findById(employeeId);
        RequestDispatcher dispatcher;
        if (employee == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            dispatcher = request.getRequestDispatcher("view/employee/view.jsp");
            request.setAttribute("employee", employee);
            request.setAttribute("positions", positions);
            request.setAttribute("educationDegrees", educationDegrees);
            request.setAttribute("divisions", divisions);
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) {
        String employeeName = request.getParameter("employeeName");
        List<Employee> employees = this.employeeService.findByName(employeeName);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/employee/list.jsp");
        request.setAttribute("employees", employees);
        request.setAttribute("positions", positions);
        request.setAttribute("educationDegrees", educationDegrees);
        request.setAttribute("divisions", divisions);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}