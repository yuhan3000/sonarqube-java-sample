/*
package com.uob;

public class HelloBank {
    public static void main(String[] args) {
        String password = "abc"; // insecure: hardcoded password
        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOBx!");
    }
}*/


package com.uob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloBank {
    public static void main(String[] args) {
        // VULNERABILITY: Hardcoded password for database connection
        String dbUser = "admin";
        String dbPassword = "abc123"; // SonarCloud should flag this as a Vulnerability

        try {
            // Simulate DB connection using hardcoded credentials
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bank", dbUser, dbPassword);
            System.out.println("Connected to database!");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

