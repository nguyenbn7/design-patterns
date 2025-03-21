package examples;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    @Override
    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("---- ");
        display.append(name);
        display.append(" ----\n");
        display.append(dough);
        display.append("\n");
        display.append(sauce);
        display.append("\n");
        for (String topping : toppings) {
            display.append(topping);
            display.append("\n");
        }
        return display.toString();
    }
}
