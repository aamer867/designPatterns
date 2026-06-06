package sia;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Mocha";
    }

    @Override
    public float cost() {
        return super.getBeverage().cost() + 0.25f;
    }

}
