import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import duck.RubberDuck;
import fly.FlyBehavior;
import fly.FlyRocketPowered;
import quack.QuackBehavior;

public class App {
    public static void main(String[] args) throws Exception {
        // Default behavior
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        // change behavior through method
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        // change default behaviors through constructor
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        rubberDuckie.performQuack();
    }
}
