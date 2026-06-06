package sia;

public class HouseBlend extends Beverage {

    public String getDescription() {
        return "HouseBlend with: ";
    }

    @Override
    public float cost() {
        return 0.59f;
    }
}
