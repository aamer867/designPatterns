package sia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        NYPizzaFactory  nypizzaFactory = new NYPizzaFactory();
        PizzaStore ps = new PizzaStore(nypizzaFactory);
        ps.orderPizza("cheese");
    }
}
