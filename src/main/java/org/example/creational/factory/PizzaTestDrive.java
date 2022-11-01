package org.example.creational.factory;

import org.example.creational.factory.pizza.Pizza;
import org.example.creational.factory.store.ChicagoPizzaStore;
import org.example.creational.factory.store.NYPizzaStore;
import org.example.creational.factory.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
