package sia;

public class PizzaStore {
    SimplePizzaFactory factory;
    Pizza pizza;
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    void orderPizza(String type) {
        pizza = factory.getPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
