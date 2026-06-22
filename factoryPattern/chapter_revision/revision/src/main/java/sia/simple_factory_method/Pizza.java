package sia.simple_factory_method;

public abstract class Pizza {
    public void prepare(){
        System.out.println("Pizza preparing...");
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
}
