package org.example;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void VeryBadMethod() {
        String value = null;

        if(value.equals("ok")) {
            IO.print("ok");
        }        
    }

    private void unusedMethod() {
        // should be removed
    }

    static void main() {
        System.out.println("Sum of 2 and 3 is: " + sum(2, 3));
        VeryBadMethod();
    }
}
