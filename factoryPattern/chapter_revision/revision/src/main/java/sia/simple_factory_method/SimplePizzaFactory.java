package sia.simple_factory_method;

import sia.simple_factory_method.pizaa_types.CheesePizza;
import sia.simple_factory_method.pizaa_types.GreekPizza;
import sia.simple_factory_method.pizaa_types.PepperoniPizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new CheesePizza();
        } else if (type.equals("pepperoni")){
            return new PepperoniPizza();
        } else if (type.equals("greek")){
            return new GreekPizza();
        } else {
            return null;
        }
    }

}
