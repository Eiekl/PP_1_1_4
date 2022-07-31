package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь

        UserServiceImpl usi = new UserServiceImpl();

        usi.createUsersTable();

        usi.saveUser("Name1", "LastName1", (byte) 20);
        usi.saveUser("Name2", "LastName2", (byte) 25);
        usi.saveUser("Name3", "LastName3", (byte) 31);
        usi.saveUser("Name4", "LastName4", (byte) 38);
        System.out.println(usi.getAllUsers());

        usi.removeUserById(1);
        usi.getAllUsers();
        usi.cleanUsersTable();
        usi.dropUsersTable();
    }
}
