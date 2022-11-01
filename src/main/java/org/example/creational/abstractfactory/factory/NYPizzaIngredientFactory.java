package org.example.creational.abstractfactory.factory;

import org.example.creational.abstractfactory.ingredients.Cheese;
import org.example.creational.abstractfactory.ingredients.Clams;
import org.example.creational.abstractfactory.ingredients.Dough;
import org.example.creational.abstractfactory.ingredients.FreshClams;
import org.example.creational.abstractfactory.ingredients.Garlic;
import org.example.creational.abstractfactory.ingredients.MarinaraSauce;
import org.example.creational.abstractfactory.ingredients.Mushroom;
import org.example.creational.abstractfactory.ingredients.Onion;
import org.example.creational.abstractfactory.ingredients.Pepperoni;
import org.example.creational.abstractfactory.ingredients.RedPepper;
import org.example.creational.abstractfactory.ingredients.ReggianoCheese;
import org.example.creational.abstractfactory.ingredients.Sauce;
import org.example.creational.abstractfactory.ingredients.SlicedPepperoni;
import org.example.creational.abstractfactory.ingredients.ThinCrustDough;
import org.example.creational.abstractfactory.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {
                new Garlic(),
                new Onion(),
                new Mushroom(),
                new RedPepper(),
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
