package sia.abstract_factory;


public class NYPizzaStore extends PizzaStore {
    NYIngredientsPizzaFactory factory = new NYIngredientsPizzaFactory();
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new NYCheesePizza(factory);
        } else {
            return null;
        }
    }
}
