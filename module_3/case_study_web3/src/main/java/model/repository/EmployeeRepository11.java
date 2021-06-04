//package model.repository;
//
//import model.bean.customer.Customer;
//import model.bean.customer.CustomerType;
//import model.bean.employee.Employee;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class EmployeeRepository11 {
//
//    private BaseRepository baseRepository = new BaseRepository();
//    private final String SELECT_ALL_EMPLOYEE = "SELECT * FROM case_study_db_web2.employee;";
//    private final String SELECT_EMPLOYEE_BY_ID = "SELECT * FROM case_study_db_web2.employee where employee_id=?";
//    private final String SELECT_EMPLOYEE_BY_NAME = "sSELECT * FROM case_study_db_web2.employee where employee_name like ?";
//    private final String INSERT_EMPLOYEE = "insert into employee(employee_name,position_id,education_degree_id,division_id,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,username )\n" +
//            "values (?,?,?,?,?,?,?,?,?,?,?)";
//    private final String UPDATE_EMPLOYEE_BY_ID = "update employee " +
//            "set employee_name=?,position_id=?,education_degree_id=?,division_id=?,employee_birthday=?,employee_id_card=?,employee_salary=?,employee_phone=?,employee_email=?,employee_address=?,username=?" +
//            "where employee_id=?";
//
//    private final String DELETE_EMPLOYEE_BY_ID = "delete from employee where employee_id=?";
//    private final String SELECT_ALL_POSITION = "select * from position";
//
//    private final String SELECT_ALL_EDUCATION_DEGREE = "select * from education_degree";
//    private final String SELECT_ALL_DIVISION= "select * from division";
//
//    public List<Employee> findAll() {
//        List<Employee> employees = new ArrayList<>();
//        Connection connection = baseRepository.getConnection();
//        try {
//            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int employeeId = resultSet.getInt("employee_id");
//                String employeeName = resultSet.getNString("employee_name");
//                int positionId = resultSet.getInt("position_id");
//                int educationDegreeId = resultSet.getInt("education_degree_id");
//                String divisionId = resultSet.getString("division_id");
//                String employeeBirthday = resultSet.getString("employee_birthday");
//
//                String employeeIdCard = resultSet.getString("employee_id_card");
//                double employeeSalary = resultSet.getDouble("employee_salary");
//                String employeePhone = resultSet.getString("employee_phone");
//                String employeeEmail = resultSet.getString("employee_email");
//                String employeeAddress = resultSet.getString("employee_address");
//                employees.add(new Employee(employeeId, employeeName, positionId, educationDegreeId,
//                        divisionId, employeeBirthday, employeeIdCard, employeeSalary, employeePhone,employeeEmail,employeeAddress));
//            }
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return employees;
//    }
//
//
//    public Customer findById(int id) {
//        Employee employee = null;
//        Connection connection = baseRepository.getConnection();
//        try {
//            PreparedStatement statement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
//            statement.setInt(1, id);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int customer_id = resultSet.getInt("employee_id");
//                int customer_type_id = resultSet.getInt("employee_name");
//                String customer_name = resultSet.getString("position_id");
//                String customer_birthday = resultSet.getString("education_degree_id");
//                String customer_gender = resultSet.getString("division_id");
//                String customer_id_card = resultSet.getString("employee_birthday");
//                String customer_phone = resultSet.getString("employee_id_card");
//                String customer_email = resultSet.getString("employee_salary");
//                String employee_phone = resultSet.getString("employee_phone");
//                String employee_email = resultSet.getString("employee_email");
//                String customer_address = resultSet.getString("employee_address");
//                employee = new Customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address);
//            }
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return employee;
//    }
//
//
//    public List<Customer> findByName(String name) {
//        List<Customer> customers = new ArrayList<>();
//        Connection connection = baseRepository.getConnection();
//        try {
//            PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_BY_NAME);
//            statement.setString(1, "%" + name + "%");
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int customer_id = resultSet.getInt("customer_id");
//                int customer_type_id = resultSet.getInt("customer_type_id");
//                String customer_name = resultSet.getString("customer_name");
//                String customer_birthday = resultSet.getString("customer_birthday");
//                String customer_gender = resultSet.getString("customer_gender");
//                String customer_id_card = resultSet.getString("customer_id_card");
//                String customer_phone = resultSet.getString("customer_phone");
//                String customer_email = resultSet.getString("customer_email");
//                String customer_address = resultSet.getString("customer_address");
//                customers.add(new Customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address));
//            }
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return customers;
//    }
//
//
//    public boolean insert(Customer customer) {
//        boolean rowInsert = false;
//        Connection connection = baseRepository.getConnection();
//        try {
//            //customer_type_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email, customer_address
//            PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER);
//            statement.setInt(1, customer.getCustomerTypeId());
//            statement.setString(2, customer.getCustomerName());
//            statement.setString(3, customer.getCustomerBirthday());
//            statement.setInt(4, Integer.parseInt(customer.getCustomerGender()));
//            statement.setString(5, customer.getCustomerIdCard());
//            statement.setString(6, customer.getCustomerPhone());
//            statement.setString(7, customer.getCustomerEmail());
//            statement.setString(8, customer.getCustomerAddress());
//            System.out.println(statement.toString());
//            rowInsert = statement.executeUpdate() > 0;
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return rowInsert;
//    }
//
//    public boolean update(int customer_id, Customer customer) {
//        boolean rowUpdate = false;
//        Connection connection = baseRepository.getConnection();
//        // int customerTypeId, String customerName, String customerBirthday, String customerGender, String customerIdCard,
//        //                    String customerPhone, String customerEmail, String customerAddress)
//        try {
//            PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_BY_ID);
//            statement.setInt(1, customer.getCustomerTypeId());
//            statement.setString(2, customer.getCustomerName());
//            statement.setString(3, customer.getCustomerBirthday());
//            statement.setInt(4, Integer.parseInt(customer.getCustomerGender()));
//            statement.setString(5, customer.getCustomerIdCard());
//            statement.setString(6, customer.getCustomerPhone());
//            statement.setString(7, customer.getCustomerEmail());
//            statement.setString(8, customer.getCustomerAddress());
//            statement.setInt(9, customer.getCustomerId());
//            rowUpdate = statement.executeUpdate() > 0;
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return rowUpdate;
//    }
//
//
//    public boolean delete(int customer_id) {
//        boolean rowDelete = false;
//        Connection connection = baseRepository.getConnection();
//        try {
//            PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);
//            statement.setInt(1, customer_id);
//            rowDelete = statement.executeUpdate() > 0;
//            statement.close();
//            connection.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return rowDelete;
//    }
//
//    public List<CustomerType> findAllCustomerType() {
//        List<CustomerType> customerTypes = new ArrayList<>();
//        try {
//            Connection connection = baseRepository.getConnection();
//            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                int customer_type_id = resultSet.getInt("customer_type_id");
//                String customer_type_name = resultSet.getString("customer_type_name");
//                customerTypes.add(new CustomerType(customer_type_id, customer_type_name));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return customerTypes;
//    }
//}
