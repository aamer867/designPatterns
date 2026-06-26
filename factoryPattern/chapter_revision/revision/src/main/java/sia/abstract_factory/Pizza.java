package sia.abstract_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private String name;
    private List<String> toppings = new ArrayList<String>();
    private IngredientPizzaFactory ingredientPizzaFactory;

    public Pizza(IngredientPizzaFactory ingredientPizzaFactory) {
        this.ingredientPizzaFactory = ingredientPizzaFactory;
    }

    public void prepare(){
        System.out.println("Pizza preparing...");
        System.out.println("Pizza name: " + getName());
        System.out.println("Pizza dough: " + this.ingredientPizzaFactory.createDough());
        System.out.println("Pizza sauce: " + this.ingredientPizzaFactory.createSouce());
        System.out.println("Pizza cheese: " + this.ingredientPizzaFactory.createCheese());
        for (String topping : toppings){
            System.out.println("Adding topping: " + topping);
        }
    }
    public void bake(){
        System.out.println("Pizza baking...");
    }
    public void cut(){
        System.out.println("Pizza cuting...");
    }
    public void box(){
        System.out.println("Pizza box...");
    }
    public String getName() {return name;}
}
