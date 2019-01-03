package Strategy;

import Strategy.FlyBehavior;

public class FlyRocket implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with rocket!!!!");
    }
}
