
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("ham");
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
