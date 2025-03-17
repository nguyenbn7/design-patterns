package examples;

public class App {

    public static void main(String[] args) {
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()
                + " $" + beverage1.cost());
    }
}
