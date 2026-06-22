package sia;

public abstract class SimplePizzaFactory {
    private Pizza pizza;
    public Pizza getPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        }
        if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        }
        else {
            return new RegularPizza();
        }
    }
}
