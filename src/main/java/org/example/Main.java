package org.example;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }   

    public static void VeryBadMethod() {
        String value = null;
        IO.print(value.toString()); 
    }

    private void unusedMethod() {
        // This method is not used anywhere
    }

    static void main() {
        int result = sum(5, 10);
        IO.print("The sum is: " + result);
        VeryBadMethod();
    }
}
