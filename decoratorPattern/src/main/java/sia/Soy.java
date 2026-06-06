package sia;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getBeverage().getDescription() + "Soy ";
    }

    @Override
    public float cost() {
        return super.getBeverage().cost() + 0.29f;
    }

}
