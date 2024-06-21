package examples;

public abstract class CondimentDecorator extends Beverage {

    protected final Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();
}
