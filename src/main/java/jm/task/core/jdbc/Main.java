package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("test", "test", (byte) 12);
        System.out.println("User с именем – " + "test" + " добавлен в базу данных");
        userService.saveUser("test1", "test1", (byte) 22);
        System.out.println("User с именем – " + "test1" + " добавлен в базу данных");
        userService.saveUser("test2", "test2", (byte) 34);
        System.out.println("User с именем – " + "test2" + " добавлен в базу данных");
        userService.saveUser("test3", "test3", (byte) 11);
        System.out.println("User с именем – " + "test3" + " добавлен в базу данных");

        List<User> list = userService.getAllUsers();
        for (User u : list) {
            System.out.println(u.toString());
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
//        userService.dropUsersTable();
    }
}
