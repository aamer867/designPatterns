package sia;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Soy";
    }

    @Override
    public float cost() {
        return super.getBeverage().cost() + 0.29f;
    }

}
