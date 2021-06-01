package model.service;

import model.bean.User;

import java.util.List;

public interface IUserService {
    public void insertUser(User user) ;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public boolean deleteUser(int id) ;

    public boolean updateUser(User user);

    public List<User> sortByName() ;
    public List<User> findByCountry(String country) ;
}
