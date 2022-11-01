package org.example.creational.abstractfactory.pizza;

import org.example.creational.abstractfactory.ingredients.Cheese;
import org.example.creational.abstractfactory.ingredients.Clams;
import org.example.creational.abstractfactory.ingredients.Dough;
import org.example.creational.abstractfactory.ingredients.Pepperoni;
import org.example.creational.abstractfactory.ingredients.Sauce;
import org.example.creational.abstractfactory.ingredients.Veggies;

public abstract class Pizza {

    public String name;

    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
