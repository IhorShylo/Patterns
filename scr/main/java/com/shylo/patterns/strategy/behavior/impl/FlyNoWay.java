package com.shylo.patterns.strategy.behavior.impl;

import com.shylo.patterns.strategy.behavior.FlyBehavior;

/**
 * Реализация для уток, которые НЕ УМЕЮТ летать
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }
}
