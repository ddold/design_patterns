package org.example.creational.abstractfactory.factory;

import org.example.creational.abstractfactory.ingredients.EggPlant;
import org.example.creational.abstractfactory.ingredients.FrozenClam;
import org.example.creational.abstractfactory.ingredients.MozzarellaCheese;
import org.example.creational.abstractfactory.ingredients.PlumTomatoSauce;
import org.example.creational.abstractfactory.ingredients.ThickCrustDough;
import org.example.creational.abstractfactory.ingredients.BlackOlives;
import org.example.creational.abstractfactory.ingredients.Cheese;
import org.example.creational.abstractfactory.ingredients.Clams;
import org.example.creational.abstractfactory.ingredients.Dough;
import org.example.creational.abstractfactory.ingredients.Pepperoni;
import org.example.creational.abstractfactory.ingredients.Sauce;
import org.example.creational.abstractfactory.ingredients.SlicedPepperoni;
import org.example.creational.abstractfactory.ingredients.Spinach;
import org.example.creational.abstractfactory.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {
                new Spinach(),
                new EggPlant(),
                new BlackOlives()
        };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClam();
    }
}
