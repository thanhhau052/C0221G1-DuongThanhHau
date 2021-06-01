package model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {

    private String jdbcURL= "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private String jdbcUserName = "root";
    private String jdbcPassword ="Duongthanhhau1";

    protected Connection getConnection(){
        Connection connection =null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL,jdbcUserName,jdbcPassword);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}