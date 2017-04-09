package com.shylo.patterns.strategy.behavior.impl;

import com.shylo.patterns.strategy.behavior.QuackBehavior;

/**
 * Реализация пищания(для резиновой утки)
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
