package examples;

public class SimplePizzaFactory {

    public Pizza createPizza(TypesPizza type) {
        Pizza pizza = null;

        switch (type) {
            case TypesPizza.CHEESE ->
                pizza = new CheesePizza();
            case TypesPizza.PEPPERONI ->
                pizza = new PepperoniPizza();
            case TypesPizza.CLAM ->
                pizza = new ClamPizza();
            case TypesPizza.VEGGIE ->
                pizza = new VeggiePizza();
            default -> {
            }
        }

        return pizza;
    }
}
