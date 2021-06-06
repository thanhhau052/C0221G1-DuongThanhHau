package model.repository;

import model.bean.customer.Customer;
import model.bean.view_customer.CustomerUserService;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerUSRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private String SELECT_ALL_CUS = "select* from case_study_db_web2.view_customer;";
    private String SELECT_CUS_BY_ID = "select* from view_customer \n" +
            "where contract_id=? ; ";
    private String SELECT_CUS_BY_NAME = "select* from view_customer\n" +
            "where customer_name like '%?%';";
//    private  String UPDATE_CUS


    public List<CustomerUserService> findAll() {
        List<CustomerUserService> customerUserServices = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_CUS);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contractId");
                int customerId = resultSet.getInt("customerId");
                String customerName = resultSet.getString("customerName");
                String serviceName = resultSet.getString("serviceName");
                String contractStartDay = resultSet.getString("contractStartDay");
                String contractEndDay = resultSet.getString("contractEndDay");

                customerUserServices.add(new CustomerUserService(contractId, customerId, customerName, serviceName, contractStartDay, contractEndDay));

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerUserServices;
    }

    //    private  int contractId;
//    private int customerId;
//    private  String customerName;
//    private String serviceName;
//    private  String contractStartDay;
//    private  String contractEndDay;
    public CustomerUserService findById(int id) {
        CustomerUserService customerUserService = null;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_CUS_BY_ID);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contractId");
                int customerId = resultSet.getInt("customerId");
                String customerName = resultSet.getString("customerName");
                String serviceName = resultSet.getString("serviceName");
                String contractStartDay = resultSet.getString("contractStartDay");
                String contractEndDay = resultSet.getString("contractEndDay");
                customerUserService = new CustomerUserService(contractId, customerId, customerName, serviceName,
                        contractStartDay, contractEndDay);
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerUserService;
    }

    public List<CustomerUserService> findByName(String name) {
        List<CustomerUserService> customerUserServices = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_CUS_BY_NAME);
            statement.setString('1', "%" + name + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contractId");
                int customerId = resultSet.getInt("customerId");
                String customerName = resultSet.getString("customerName");
                String serviceName = resultSet.getString("serviceName");
                String contractStartDay = resultSet.getString("contractStartDay");
                String contractEndDay = resultSet.getString("contractEndDay");
                customerUserServices.add(new CustomerUserService(contractId, customerId, customerName, serviceName, contractStartDay, contractEndDay));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerUserServices;

    }


}
