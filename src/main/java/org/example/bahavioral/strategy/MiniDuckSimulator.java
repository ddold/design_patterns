package org.example.bahavioral.strategy;

import org.example.bahavioral.strategy.behaviors.FlyRocketPowered;
import org.example.bahavioral.strategy.models.Duck;
import org.example.bahavioral.strategy.models.MallardDuck;
import org.example.bahavioral.strategy.models.ModelDuck;

/*
https://refactoring.guru/design-patterns/strategy
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
