package model.repository;

import model.bean.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    BaseRepository baseRepository = new BaseRepository();
    final String CALL_SELCET = "call select_user()";
    final String CALL_DELETE = "call delete_user(?)";
    final String CALL_UPDATE = " call update_user(?,?,?,?)";
    final String SELECT_USERS_BY_ID = "select* from users\n" +
            "where id=?;";

    public List<User> userList() {
        List<User> userList = new ArrayList<>();
        Connection connection = baseRepository.connectDatabase();
        CallableStatement callableStatement = null;
        try {
            callableStatement = connection.prepareCall(CALL_SELCET);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getNString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                User user = new User(id, name, email, country);
                userList.add(user);

            }
            callableStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public boolean delete_user(int id) {
        boolean check = false;
        Connection connection = baseRepository.connectDatabase();
        try {
            CallableStatement callableStatement = connection.prepareCall(CALL_DELETE);
            callableStatement.setInt(1, id);
            check = callableStatement.executeUpdate() > 0;
            connection.close();
            callableStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    public boolean update_usre(int id, User user) {
        boolean check = false;
        Connection connection = baseRepository.connectDatabase();
        try {
            CallableStatement callableStatement = connection.prepareCall(CALL_UPDATE);
            callableStatement.setString(1, user.getName());
            callableStatement.setString(2, user.getEmail());
            callableStatement.setString(3, user.getCountry());
            callableStatement.setInt(4, id);
            check = callableStatement.executeUpdate() > 0;
            connection.close();
            callableStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return check;
    }

    public User selectUser(int inputID) {
        Connection connection = baseRepository.connectDatabase();
        User user = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USERS_BY_ID);
            preparedStatement.setInt(1, inputID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
