package com.shylo.patterns.strategy.objects;

import com.shylo.patterns.strategy.behavior.FlyBehavior;
import com.shylo.patterns.strategy.behavior.QuackBehavior;

/**
 * Created by Igor on 09.04.2017.
 */
public abstract class Duck {
    //Обьявляем 2 ссылочные переменные с типами интерфесов ПОВЕДЕНИЯ
    //Переменные наследуются всеми подклассами Duck(в том же пакете - модификатор доступа default)
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    abstract void display();

    //Сеттеры позводяют динамически менять поведения утки БЕЗ ПЕРЕКОМПИЛЯЦИИ ИСХОДНЫХ ФАЙЛОВ УТОК
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    //В зависимости от реализации будет осуществлятся нужное
    public void performFly(){
        flyBehavior.fly();
    }

    //В зависимости от реализации будет осуществлятся нужное
    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }
}
