package com.shylo.patterns.strategy.objects;

import com.shylo.patterns.strategy.behavior.impl.FlyWithWings;
import com.shylo.patterns.strategy.behavior.impl.Quack;

/**
 * Дикая утка
 */
public class MallardDuck extends Duck {

    //Наследуем переменные с родительского класса Duck
    //И в конструкторе определяем поведения для такого типа обьектов
    //Дикая утка умеет летать и крякать!
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm real Mallard duck");
    }
}
