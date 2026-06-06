package sia;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        super(beverage);
    }
    @Override
    public float cost() {
        return getBeverage().cost() + 0.29f;
    }

    @Override
    public String getDescription() {
        return "Mocha";
    }
}
