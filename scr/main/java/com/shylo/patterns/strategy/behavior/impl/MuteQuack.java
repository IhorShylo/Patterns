package com.shylo.patterns.strategy.behavior.impl;

import com.shylo.patterns.strategy.behavior.QuackBehavior;

/**
 * Отсутствие крякания
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
