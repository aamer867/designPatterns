package sia;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getBeverage().getDescription() + "Mocha ";
    }

    @Override
    public float cost() {
        return super.getBeverage().cost() + 0.25f;
    }

}
