package model.repository;

import model.bean.view_customer.CustomerUserService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerUserServicrRepository {
    BaseRepository basaRepository = new BaseRepository();
    final String SELECT_ALL = "select*from view_customer";
    final String SEARCH_CUSTOMEUSESERVICE="select* from view_customer\n" +
            "where customer_name like ?";
    final String DELETE_CONTRACT="delete from contract where contract_id=?";



    public List<CustomerUserService> listCustomerUseService() {
        List<CustomerUserService> customerUseServices = new ArrayList<>();
        Connection connection = basaRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contract_id");
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String serviceName = resultSet.getString("service_name");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                String attachServiceName = resultSet.getString("attach_service_name");
                customerUseServices.add(new CustomerUserService(contractId,customerId,customerName,serviceName,contractStartDate,contractEndDate,attachServiceName));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerUseServices;
    }

//    public static void main(String[] args) {
//        System.out.println(new CustomerUserServicrRepository().listCustomerUseService().size());
//    }

    public List<CustomerUserService> search(String search) {
        Connection connection = basaRepository.getConnection();
        List<CustomerUserService> customerUseServices = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_CUSTOMEUSESERVICE);
            preparedStatement.setString(1, "%"+ search +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int contractId = resultSet.getInt("contract_id");
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String serviceName = resultSet.getString("service_name");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                String attachServiceName = resultSet.getString("attach_service_name");
                customerUseServices.add(new CustomerUserService(contractId,customerId,customerName,serviceName,contractStartDate,contractEndDate,attachServiceName));


            }
            preparedStatement.close();
            connection.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerUseServices;
    }

    public boolean delete(int id) {
        Connection connection = basaRepository.getConnection();
        PreparedStatement preparedStatement = null;
        boolean rowDeleted = false;
        try {
            preparedStatement = connection.prepareStatement(DELETE_CONTRACT);
            preparedStatement.setInt(1, id);
            rowDeleted = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rowDeleted;
    }

}
