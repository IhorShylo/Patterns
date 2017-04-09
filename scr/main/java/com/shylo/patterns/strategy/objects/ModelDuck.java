package com.shylo.patterns.strategy.objects;

import com.shylo.patterns.strategy.behavior.impl.FlyNoWay;
import com.shylo.patterns.strategy.behavior.impl.Quack;

/**
 * Created by Igor on 09.04.2017.
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        //Утка-приманка изначально летать НЕ УМЕЕТ
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm model duck");;
    }
}
