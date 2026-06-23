package sia;

import sia.simple_factory_method.PizzaStore;
import sia.simple_factory_method.SimplePizzaFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Testing of Simple Factory:
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("pepperoni");
        pizzaStore.orderPizza("greek");

    }
}