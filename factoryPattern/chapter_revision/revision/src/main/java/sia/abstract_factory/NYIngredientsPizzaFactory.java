package sia.abstract_factory;

import sia.abstract_factory.ingredient_types.*;

public class NYIngredientsPizzaFactory extends IngredientPizzaFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Cheese  createCheese() {
        return new MozzarellaCheese();
    }
    public Souce createSouce() {
        return new MarinaraSauce();
    }
    public Clam createClams() {
        return new FreshClams();
    }
}
