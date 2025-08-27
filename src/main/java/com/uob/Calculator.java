/*
package com.uob;

public class Calculator {
    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) { // empty catch block
            
        }
        return 0;
    }
}*/

package com.uob;

public class Calculator {
    public int divide(int a, int b) {
        // This will throw ArithmeticException if b = 0
        return a / 0; // hardcoded division by zero → Bug
    }
}

