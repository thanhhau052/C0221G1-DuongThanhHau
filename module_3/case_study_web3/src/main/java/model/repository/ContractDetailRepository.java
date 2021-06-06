package model.repository;

import model.bean.contract.AttachService;
import model.bean.contract.Contract;
import model.bean.contract.ContractDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailRepository {
    BaseRepository baseRepository=new BaseRepository();

    String insertContractDetail="insert into contract_detail(contract_id,attach_service_id,quantity)\n" +
            " values (?,?,?);";



    public boolean createContractDetail(ContractDetail contractDetail) throws SQLException {
        boolean check = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(insertContractDetail);
            statement.setInt(1,contractDetail.getContractId());
            statement.setInt(2,contractDetail.getAttachServiceId());
            statement.setInt(3,contractDetail.getQuantity());
            check = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    public List<AttachService> findByAllAttachService() {
        Connection connection = baseRepository.getConnection();
        List<AttachService> attachServices = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from attach_service");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int attachServiceId=resultSet.getInt("attach_service_id");
                String attachServiceName=resultSet.getString("attach_service_name");
                double attachServiceCost=resultSet.getDouble("attach_service_cost");
                int attachServiceUnit=resultSet.getInt("attach_service_until");
                String attachServiceStatus=resultSet.getString("attach_service_status");
                attachServices.add(new AttachService(attachServiceId,attachServiceName,attachServiceCost,attachServiceUnit,attachServiceStatus));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachServices;
    }

}