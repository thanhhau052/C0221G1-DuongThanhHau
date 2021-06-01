package model.service.impl;

import model.bean.User;
import model.repository.UserRepository;
import model.service.IUserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService {
    UserRepository userRepository = new UserRepository();




    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.userList();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepository.delete_user(id);
    }

    @Override
    public boolean updateUser(int id, User user) throws SQLException {
        return userRepository.update_usre(id, user);
    }
}
