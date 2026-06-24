package sia;

import sia.method_factory_pattern.ChicagoPizzaStore;
import sia.method_factory_pattern.NYPizzaStore;
import sia.simple_factory.PizzaStore;
import sia.simple_factory.SimplePizzaFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Testing Simple Factory Pattern:");
        // Testing of Simple Factory:
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("pepperoni");
        pizzaStore.orderPizza("greek");

        System.out.println("Testing Method Factory Pattern:");

        // Testing of Method Factory:
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        nyPizzaStore.orderPizza("pepperoni");
        nyPizzaStore.orderPizza("greek");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("pepperoni");
        chicagoPizzaStore.orderPizza("greek");

    }
}