package sia.method_factory_pattern;

import sia.method_factory_pattern.pizza_types.NYCheesePizza;
import sia.method_factory_pattern.pizza_types.NYGreekPizza;
import sia.method_factory_pattern.pizza_types.NYPepproniPizza;
import sia.simple_factory.pizaa_types.PepperoniPizza;

public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new NYCheesePizza();
        } else if(type.equals("greek")){
            return new NYGreekPizza();
        } else if(type.equals("pepperoni")){
            return new NYPepproniPizza();
        } else {
            return null;
        }
    }
}
