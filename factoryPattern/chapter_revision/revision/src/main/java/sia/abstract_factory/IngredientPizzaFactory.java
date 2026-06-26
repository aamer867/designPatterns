package sia.abstract_factory;

import sia.abstract_factory.ingredient_types.Cheese;
import sia.abstract_factory.ingredient_types.Clam;
import sia.abstract_factory.ingredient_types.Dough;
import sia.abstract_factory.ingredient_types.Souce;

public abstract class IngredientPizzaFactory {
    public abstract Dough createDough();
    public abstract Souce createSouce();
    public abstract Cheese createCheese();
    public abstract Clam createClams();
}
