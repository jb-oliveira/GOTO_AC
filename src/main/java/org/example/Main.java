package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void veryBadMethod() {
        String value = null;

        if (value == null)
            System.out.println("Validation passed");

        if ("ok".equals(value)) {
            System.out.println("Still passed");
        }
    }

    static void main() {
        System.out.println("Sum 3+4: " + sum(3, 4));
        veryBadMethod();
    }
}
