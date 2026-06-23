package sia.simple_factory_method;

import sia.simple_factory_method.pizaa_types.CheesePizza;
import sia.simple_factory_method.pizaa_types.GreekPizza;
import sia.simple_factory_method.pizaa_types.PepperoniPizza;

public class PizzaStore {
    /**
     * 1) That is the parameterized type of the SimplePizzaFactory method.
     *      a) Here we are adding the if, else statements in the order pizza.
     * 2) Here we will take the pizza creation out of the order pizza, why?
     *      a) We can create different pizza types in the future.
     *      b) And if we need to create a different pizza type, we will need to open this class again, which has a lot of
     *      constants like prepare, bake, cut, and box.
     *      c) So, we need to return to a design principle, Encapsulate what varies.
     *      d) We have encapsulated what varies "The Type of Pizza", and the rest "which non-varies" is kept in the method.
     * */

        private final SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory simpleFactory) {
        this.pizzaFactory = simpleFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
