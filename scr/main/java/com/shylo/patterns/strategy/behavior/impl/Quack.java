package com.shylo.patterns.strategy.behavior.impl;

import com.shylo.patterns.strategy.behavior.QuackBehavior;

/**
 * Обычное крякание
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
