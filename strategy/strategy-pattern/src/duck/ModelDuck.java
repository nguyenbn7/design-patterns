package duck;

import fly.FlyNoWay;
import quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
