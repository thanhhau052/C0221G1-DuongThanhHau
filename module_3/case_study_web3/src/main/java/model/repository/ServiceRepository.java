package model.repository;

import model.bean.customer.Customer;
import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private final String SELECT_ALL_SERVICE = "SELECT * FROM case_study_db_web2.service;";
    private final String SELECT_SERVICE_BY_ID = "select * from service where service_id=?";
    private final String SELECT_SERVICE_BY_NAME = "select * from service where service_name like ?";
    private final String INSERT_SERVICE = "insert into service(service_name,service_area,service_cost,service_max_people," +
            "rent_type_id,service_type_id,standard_room,description_other_convenience,pool_area,number_of_floors)" +
            "values(?,?,?,?,?,?,?,?,?,?)";
    private final String SELECT_ALL_SERVICE_TYPE = "select * from service_type";
    private final String SELECT_ALL_RENT_TYPE = "select * from rent_type";


    public boolean insert(Service service) {
        boolean rowInsert = false;
        Connection connection = baseRepository.getConnection();
        try {
            //service_name ,service_area,   service_cost,   service_max_people," +
            //            "rent_type_id     ,service_type_id,   standard_room,  description_other_convenience,  pool_area,number_of_floors
            PreparedStatement statement = connection.prepareStatement(INSERT_SERVICE);
            statement.setString(1, service.getServiceName());
            statement.setInt(2, service.getServiceArea());
            statement.setDouble(3, service.getServiceCost());
            statement.setInt(4, service.getServiceMaxPeople());

            statement.setInt(5, service.getServiceTypeId());
            statement.setInt(6, service.getServiceTypeId());
            statement.setString(7, service.getStandardRoom());
            statement.setString(8, service.getDescriptionOtherConvenience());
            statement.setDouble(9, service.getPoolArea());
            statement.setInt(10, service.getNumberOfFloors());
            System.out.println(statement.toString());
            rowInsert = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInsert;
    }

    public List<ServiceType> findAllServiceType() {

        List<ServiceType> serviceTypes = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_SERVICE_TYPE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int serviceTypeId = resultSet.getInt("service_type_id");
                String serviceTypeName = resultSet.getString("service_type_name");
                serviceTypes.add(new ServiceType(serviceTypeId, serviceTypeName));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceTypes;
    }
// test chuong trinh
//    public static void main(String[] args) {
//        ServiceRepository serviceRepository= new ServiceRepository();
//        System.out.println("size"+serviceRepository.findAllRentType().size());
//    }
    public List<RentType> findAllRentType() {
        List<RentType> rentTypes = new ArrayList<>();
        try {
            Connection connection = baseRepository.getConnection();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_RENT_TYPE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int rentTypeId = resultSet.getInt("rent_type_id");
                String rentTypeName = resultSet.getString("rent_type_name");
                double rentTypeCost = resultSet.getDouble("rent_type_cost");
                rentTypes.add(new RentType(rentTypeId, rentTypeName, rentTypeCost));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentTypes;
    }
}
