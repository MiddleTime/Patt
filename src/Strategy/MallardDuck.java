package Strategy;

import Strategy.Duck;
import Strategy.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavoir = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I`m real Mallard duck");
    }
}
