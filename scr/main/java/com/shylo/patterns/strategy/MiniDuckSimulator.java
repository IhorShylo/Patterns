package com.shylo.patterns.strategy;

import com.shylo.patterns.strategy.behavior.impl.FlyRocketPowered;
import com.shylo.patterns.strategy.objects.Duck;
import com.shylo.patterns.strategy.objects.MallardDuck;
import com.shylo.patterns.strategy.objects.ModelDuck;

/**
 * Демонстрация работы паттерна СТРАТЕГИЯ
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        //Создаём переменную родительского типа и инициализируем её любым обьектом наследником
        Duck mallard = new MallardDuck();
        //Вызываем родительский метод, который выполняется уже конкретной реализацией
        mallard.performQuack();
        mallard.performFly();

        //С помощью сеттеров мы ДИНАМИЧЕСКИ можем изменить поведение утки
        //Если бы реализация находилась в иерархии Duck, то это было бы НЕВОЗМОЖНО
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
