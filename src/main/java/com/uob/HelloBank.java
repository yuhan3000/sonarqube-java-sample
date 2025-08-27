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

public class HelloBank {
    public static void main(String[] args) {
        // VULNERABILITY: Hardcoded password used for login
        String password = "abc123"; 

        // Simulate authentication (this triggers SonarCloud vulnerability detection)
        if ("user1".equals("user1") && password.equals("abc123")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOBx!");
    }
}

