package org.example.creational.abstractfactory.store;

import org.example.creational.abstractfactory.pizza.CheesePizza;
import org.example.creational.abstractfactory.pizza.ClamPizza;
import org.example.creational.abstractfactory.factory.NYPizzaIngredientFactory;
import org.example.creational.abstractfactory.factory.PizzaIngredientFactory;
import org.example.creational.abstractfactory.pizza.PepperoniPizza;
import org.example.creational.abstractfactory.pizza.Pizza;
import org.example.creational.abstractfactory.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }

        return pizza;
    }
}
