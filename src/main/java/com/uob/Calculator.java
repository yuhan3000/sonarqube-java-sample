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
    public int divide(int a) {
        int result = a / 0; // BUG: division by zero will always crash
        return result;
    }
}



