package model.service;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(int id ,User user) throws SQLException;


}