package com.shylo.patterns.strategy.behavior.impl;

import com.shylo.patterns.strategy.behavior.FlyBehavior;

/**
 * Реализация для уток, которые УМЕЮТ летать
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
