package org.example.bahavioral.template;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepare();

        System.out.println("\nMaking coffee...");
        coffee.prepare();
    }
}
