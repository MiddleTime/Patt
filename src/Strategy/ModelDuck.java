package Strategy;

import Strategy.Duck;
import Strategy.FlyNoWay;

public class ModelDuck extends Duck {
    public  ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavoir = new Quack();

    }

    @Override
    public void display() {
        System.out.println("I`m a model duck");
    }
}
