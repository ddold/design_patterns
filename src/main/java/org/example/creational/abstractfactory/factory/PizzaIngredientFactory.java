package org.example.creational.abstractfactory.factory;

import org.example.creational.abstractfactory.ingredients.Cheese;
import org.example.creational.abstractfactory.ingredients.Clams;
import org.example.creational.abstractfactory.ingredients.Dough;
import org.example.creational.abstractfactory.ingredients.Pepperoni;
import org.example.creational.abstractfactory.ingredients.Sauce;
import org.example.creational.abstractfactory.ingredients.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
