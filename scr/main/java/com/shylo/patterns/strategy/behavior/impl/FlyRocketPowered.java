package com.shylo.patterns.strategy.behavior.impl;

import com.shylo.patterns.strategy.behavior.FlyBehavior;

/**
 * Летать с реактивным двигателем
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket!");
    }
}
