package org.example.bahavioral.strategy.models;

import org.example.bahavioral.strategy.behaviors.FlyNoWay;
import org.example.bahavioral.strategy.behaviors.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
