package org.example;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void veryBadMethod() {
        String value = null;
        if ("test".equals(value)) {
            System.out.println("This is a bad method!");
        }
    }

    static void main() {
        int result = sum(5, 10);
        System.out.println("The sum is: " + result);
        veryBadMethod();
    }
}
