package sia;

public class PizzaStore {
    SimplePizzaFactory factory;
    Pizza pizza;
    void orderPizza(String type) {
        pizza = factory.getPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
