package org.example.creational.factory.store;

import org.example.creational.factory.pizza.Pizza;
import org.example.creational.factory.pizza.newyork.NYStyleCheesePizza;
import org.example.creational.factory.pizza.newyork.NYStyleClamPizza;
import org.example.creational.factory.pizza.newyork.NYStylePepperoniPizza;
import org.example.creational.factory.pizza.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
