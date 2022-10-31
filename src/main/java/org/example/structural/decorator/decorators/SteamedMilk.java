package org.example.structural.decorator.decorators;

import org.example.structural.decorator.component.Beverage;

public class SteamedMilk extends CondimentDecorator {

    Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
