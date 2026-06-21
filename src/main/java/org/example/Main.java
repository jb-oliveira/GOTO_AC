package org.example;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void VeryBadMethod() {
        String value = null;
        if (value.equals("test")) {
            System.out.println("This is a bad method!");    
        }
    }

    private void unusedMethod() {
        System.out.println("This method is never used.");
    }
    
    static void main() {
        int result = sum(5, 10);
        System.out.println("The sum is: " + result);
        VeryBadMethod();
    }
}
