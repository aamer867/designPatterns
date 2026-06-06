package sia;

public class Decaf extends Beverage {
    @Override
    public float cost() {
        return 0.99f;
    }

    public String getDescription() {
        return "Decaf with: ";
    }
}
