package sia.method_factory_pattern;

import sia.method_factory_pattern.pizza_types.*;

public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new ChicagoCheesePizza();
        } else if(type.equals("greek")){
            return new ChicagoGreekPizza();
        } else if(type.equals("pepperoni")){
            return new ChicagoPepproniPizza();
        } else {
            return null;
        }
    }
}
