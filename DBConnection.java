package com.app;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/exam_system";
            String user = "root";
            String password = "admin"; // change this

            return DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println("DB Error: " + e.getMessage());
            return null;
        }
    }
}