package Strategy;

import Strategy.Duck;
import Strategy.FlyRocket;
import Strategy.MallardDuck;
import Strategy.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocket());
        model.performFly();
    }
}
