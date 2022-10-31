package org.example.structural.decorator.decorators;

import org.example.structural.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
