package org.example.creational.factory.store;

import org.example.creational.factory.pizza.chicago.ChicagoStyleCheesePizza;
import org.example.creational.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {

        } else if (type.equals("clam")) {

        } else if (type.equals("pepperoni")) {

        }
        return null;
    }
}
