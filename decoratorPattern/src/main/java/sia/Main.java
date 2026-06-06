package sia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Beverage a = new HouseBlend();
        a = new Milk(a);
        a = new Soy(a);
        a = new Mocha(a);

        System.out.println(a.getDescription());
        System.out.println(a.cost());

    }
}