package model.repository;

import model.bean.customer.Customer;
import model.bean.customer.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL_CUSTOMER = "SELECT * FROM case_study_db_web2.customer;";
    private final String SELECT_CUSTOMER_BY_ID = "select * from customer where customer_id=?";
    private final String SELECT_CUSTOMER_BY_NAME = "select * from customer where customer_name like ?";
    private final String INSERT_CUSTOMER = "insert into customer(customer_type_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email, customer_address) " +
            "values(?,?,?,?,?,?,?,?)";
    private final String UPDATE_CUSTOMER_BY_ID = "update customer " +
            "set customer_type_id=?,customer_name=?,customer_birthday=?,customer_gender=?,customer_id_card=?,customer_phone=?,customer_email=?,customer_address=?" +
            "where customer_id=?";

    private final String DELETE_CUSTOMER_BY_ID = "delete from customer where customer_id=?";
    private final String SELECT_ALL_CUSTOMER_TYPE = "select * from customer_type";

//    public static void main(String[] args) {
//        BaseRepository baseRepository = new BaseRepository();
//    }
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int customer_id = resultSet.getInt("customer_id");
                int customer_type_id = resultSet.getInt("customer_type_id");
                String customer_name = resultSet.getString("customer_name");
                String customer_birthday = resultSet.getString("customer_birthday");
                String customer_gender = resultSet.getString("customer_gender");
                String customer_id_card = resultSet.getString("customer_id_card");
                String customer_phone = resultSet.getString("customer_phone");
                String customer_email = resultSet.getString("customer_email");
                String customer_address = resultSet.getString("customer_address");
                customers.add(new Customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }


    public Customer findById(int id) {
        Customer customer = null;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int customer_id = resultSet.getInt("customer_id");
                int customer_type_id = resultSet.getInt("customer_type_id");
                String customer_name = resultSet.getString("customer_name");
                String customer_birthday = resultSet.getString("customer_birthday");
                String customer_gender = resultSet.getString("customer_gender");
                String customer_id_card = resultSet.getString("customer_id_card");
                String customer_phone = resultSet.getString("customer_phone");
                String customer_email = resultSet.getString("customer_email");
                String customer_address = resultSet.getString("customer_address");
                customer = new Customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address);
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }


    public List<Customer> findByName(String name) {
        List<Customer> customers = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_CUSTOMER_BY_NAME);
            statement.setString(1, "%" + name + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int customer_id = resultSet.getInt("customer_id");
                int customer_type_id = resultSet.getInt("customer_type_id");
                String customer_name = resultSet.getString("customer_name");
                String customer_birthday = resultSet.getString("customer_birthday");
                String customer_gender = resultSet.getString("customer_gender");
                String customer_id_card = resultSet.getString("customer_id_card");
                String customer_phone = resultSet.getString("customer_phone");
                String customer_email = resultSet.getString("customer_email");
                String customer_address = resultSet.getString("customer_address");
                customers.add(new Customer(customer_id, customer_type_id, customer_name, customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }


    public boolean insert(Customer customer) {
        boolean rowInsert = false;
        Connection connection = baseRepository.getConnection();
        try {
            //customer_type_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email, customer_address
            PreparedStatement statement = connection.prepareStatement(INSERT_CUSTOMER);
            statement.setInt(1, customer.getCustomerTypeId());
            statement.setString(2, customer.getCustomerName());
            statement.setString(3, customer.getCustomerBirthday());
            statement.setInt(4, Integer.parseInt(customer.getCustomerGender()));
            statement.setString(5, customer.getCustomerIdCard());
            statement.setString(6, customer.getCustomerPhone());
            statement.setString(7, customer.getCustomerEmail());
            statement.setString(8, customer.getCustomerAddress());
            System.out.println(statement.toString());
            rowInsert = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInsert;
    }

    public boolean update(int customer_id, Customer customer) {
        boolean rowUpdate = false;
        Connection connection = baseRepository.getConnection();
 // int customerTypeId, String customerName, String customerBirthday, String customerGender, String customerIdCard,
        //                    String customerPhone, String customerEmail, String customerAddress)
        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMER_BY_ID);
            statement.setInt(1, customer.getCustomerTypeId());
            statement.setString(2, customer.getCustomerName());
            statement.setString(3, customer.getCustomerBirthday());
            statement.setInt(4, Integer.parseInt(customer.getCustomerGender()));
            statement.setString(5, customer.getCustomerIdCard());
            statement.setString(6, customer.getCustomerPhone());
            statement.setString(7, customer.getCustomerEmail());
            statement.setString(8, customer.getCustomerAddress());
            statement.setInt(9, customer.getCustomerId());
            rowUpdate = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }


    public boolean delete(int customer_id) {
        boolean rowDelete = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);
            statement.setInt(1, customer_id);
            rowDelete = statement.executeUpdate() > 0;
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    public List<CustomerType> findAllCustomerType() {
        List<CustomerType> customerTypes = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int customer_type_id = resultSet.getInt("customer_type_id");
                String customer_type_name = resultSet.getString("customer_type_name");
                customerTypes.add(new CustomerType(customer_type_id, customer_type_name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypes;
    }
}