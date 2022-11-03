package org.example.structural.decorator;

import org.example.structural.decorator.component.Beverage;
import org.example.structural.decorator.component.DarkRoast;
import org.example.structural.decorator.component.Espresso;
import org.example.structural.decorator.component.HouseBlend;
import org.example.structural.decorator.decorators.Mocha;
import org.example.structural.decorator.decorators.Soy;
import org.example.structural.decorator.decorators.Whip;

/*
https://refactoring.guru/design-patterns/decorator
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " €" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " €" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " €" + beverage3.cost());

    }
}
