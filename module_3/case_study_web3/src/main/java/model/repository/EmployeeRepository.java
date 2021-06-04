package model.repository;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private BaseRepository repository = new BaseRepository();
    private final String SELECT_ALL_EMPLOYEE = "select * from employee";
    private final String SELECT_EMPLOYEE_BY_ID = "select * from employee where employee_id=?";
    private final String SELECT_EMPLOYEE_BY_NAME = "select * from employee where employee_name like ?";
    private final String INSERT_EMPLOYEE = "insert into employee(  employee_name,position_id,education_degree_id,division_id," +
            "employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,username )\n " +
            "values (?, ?, ?, ?, ?, ?, ? ,?, ?, ?, ?)";
    private final String UPDATE_EMPLOYEE_BY_ID = "update employee " +
            "set employee_name=?, employee_birthday=?, employee_id_card=?, employee_salary=?, employee_phone=?, employee_email=?, employee_address=?, position_id=?, education_degree_id=?, division_id=?, username=? " +
            "where employee_id=?";
    private final String DELETE_EMPLOYEE_BY_ID = "delete from employee where employee_id=?";
    private final String SELECT_ALL_POSITION = "select * from position";
    private final String SELECT_ALL_EDUCATION_DEGREE = "select * from education_degree";
    private final String SELECT_ALL_DIVISION = "select * from division";
    private final String INSERT_USER = "insert into `user` values(?,?)";

    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        try {
            Connection connection = repository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int employee_id = resultSet.getInt("employee_id");
                String employee_name = resultSet.getString("employee_name");
                String employee_birthday = resultSet.getString("employee_birthday");
                String employee_id_card = resultSet.getString("employee_id_card");
                double employee_salary = resultSet.getDouble("employee_salary");
                String employee_phone = resultSet.getString("employee_phone");
                String employee_email = resultSet.getString("employee_email");
                String employee_address = resultSet.getString("employee_address");
                int position_id = resultSet.getInt("position_id");
                int education_degree_id = resultSet.getInt("education_degree_id");
                int division_id = resultSet.getInt("division_id");
                String username = resultSet.getString("username");
                employees.add(new Employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, username));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }


    public Employee findById(int id) {
        Employee employee = null;
        try {
            Connection connection = repository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int employee_id = resultSet.getInt("employee_id");
                String employee_name = resultSet.getString("employee_name");
                String employee_birthday = resultSet.getString("employee_birthday");
                String employee_id_card = resultSet.getString("employee_id_card");
                double employee_salary = resultSet.getDouble("employee_salary");
                String employee_phone = resultSet.getString("employee_phone");
                String employee_email = resultSet.getString("employee_email");
                String employee_address = resultSet.getString("employee_address");
                int position_id = resultSet.getInt("position_id");
                int education_degree_id = resultSet.getInt("education_degree_id");
                int division_id = resultSet.getInt("division_id");
                String username = resultSet.getString("username");
                employee = new Employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, username);
                statement.close();
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }


    public List<Employee> findByName(String name) {
        List<Employee> employees = new ArrayList<>();
        try {
            Connection connection = repository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_EMPLOYEE_BY_NAME);
            statement.setString(1, "%" + name + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int employee_id = resultSet.getInt("employee_id");
                String employee_name = resultSet.getString("employee_name");
                String employee_birthday = resultSet.getString("employee_birthday");
                String employee_id_card = resultSet.getString("employee_id_card");
                double employee_salary = resultSet.getDouble("employee_salary");
                String employee_phone = resultSet.getString("employee_phone");
                String employee_email = resultSet.getString("employee_email");
                String employee_address = resultSet.getString("employee_address");
                int position_id = resultSet.getInt("position_id");
                int education_degree_id = resultSet.getInt("education_degree_id");
                int division_id = resultSet.getInt("division_id");
                String username = resultSet.getString("username");
                employees.add(new Employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary, employee_phone, employee_email, employee_address, position_id, education_degree_id, division_id, username));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }


    public boolean insert(Employee employee) {
        boolean rowInsert = false;
        Connection connection = repository.getConnection();
        try {

            PreparedStatement statement = connection.prepareStatement(INSERT_EMPLOYEE);
            statement.setString(1, employee.getEmployeeName());
            statement.setInt(2, employee.getPositionId());
            statement.setInt(3, employee.getEducationDegreeId());
            statement.setInt(4, employee.getDivisionId());
            statement.setString(5, employee.getEmployeeBirthday());
            statement.setString(6, employee.getEmployeeIdCard());
            statement.setDouble(7, employee.getEmployeeSalary());
            statement.setString(8, employee.getEmployeePhone());
            statement.setString(9, employee.getEmployeeEmail());
            statement.setString(10, employee.getEmployeeAddress());
            statement.setString(11, employee.getUsername());
            rowInsert = statement.executeUpdate() > 0;
            // //String employeeName, String employeeBirthday, String employeeIdCard, double employeeSalary, String employeePhone,
            // String employeeEmail, String employeeAddress, int positionId, int educationDegreeId, int divisionId, String username)
            connection.commit();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInsert;
    }


    public boolean update(int employee_id, Employee employee) {
        boolean rowUpdate = false;
        Connection connection = repository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLOYEE_BY_ID);
            statement.setString(1, employee.getEmployeeName());
            statement.setString(2, employee.getEmployeeBirthday());
            statement.setString(3, employee.getEmployeeIdCard());
            statement.setDouble(4, employee.getEmployeeSalary());
            statement.setString(5, employee.getEmployeePhone());
            statement.setString(6, employee.getEmployeeEmail());
            statement.setString(7, employee.getEmployeeAddress());
            statement.setInt(8, employee.getPositionId());
            statement.setInt(9, employee.getEducationDegreeId());
            statement.setInt(10, employee.getDivisionId());
            statement.setString(11, employee.getUsername());
            statement.setInt(12, employee_id);
            rowUpdate = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    public boolean delete(int employee_id) {
        boolean rowDelete = false;
        Connection connection = repository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE_BY_ID);
            statement.setInt(1, employee_id);
            rowDelete = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    public List<Position> findAllPosition() {
        List<Position> positions = new ArrayList<>();
        Connection connection = repository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_POSITION);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int position_id = resultSet.getInt("position_id");
                String position_name = resultSet.getString("position_name");
                positions.add(new Position(position_id, position_name));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return positions;
    }

    public List<EducationDegree> findAllEducationDegree() {
        List<EducationDegree> educationDegrees = new ArrayList<>();
        Connection connection = repository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_EDUCATION_DEGREE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int eduction_degree_id = resultSet.getInt("education_degree_id");
                String eduction_degree_name = resultSet.getString("education_degree_name");
                educationDegrees.add(new EducationDegree(eduction_degree_id, eduction_degree_name));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return educationDegrees;
    }

    public List<Division> findAllDivision() {
        List<Division> divisions = new ArrayList<>();
        Connection connection = repository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_DIVISION);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int division_id = resultSet.getInt("division_id");
                String division_name = resultSet.getString("division_name");
                divisions.add(new Division(division_id, division_name));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return divisions;
    }
}
