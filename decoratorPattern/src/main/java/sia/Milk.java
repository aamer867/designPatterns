package sia;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        return super.getBeverage().getDescription() + "Milk ";
    }

    @Override
    public float cost() {
        return super.getBeverage().cost() + 0.19f;
    }
}
