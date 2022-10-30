package org.example.bahavioral.strategy.models;

import org.example.bahavioral.strategy.behaviors.FlyWithWings;
import org.example.bahavioral.strategy.behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
