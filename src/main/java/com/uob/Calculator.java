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
        return a / b; // Bug if b = 0
    }
}


