package org.example.strategy;

import org.example.strategy.behaviors.FlyRocketPowered;
import org.example.strategy.models.Duck;
import org.example.strategy.models.MallardDuck;
import org.example.strategy.models.ModelDuck;

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
