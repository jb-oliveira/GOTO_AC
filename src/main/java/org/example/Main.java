package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void VeryBadMethod() {
        String value = null;

        if (value == null)
            System.out.println("Validation passed");

        if (value.equals("ok")) {
            System.out.println("Still passed");
        }
    }


    static void main() {
        System.out.println("Sum 3+4: " + sum(3, 4));
        VeryBadMethod();
    }
}
