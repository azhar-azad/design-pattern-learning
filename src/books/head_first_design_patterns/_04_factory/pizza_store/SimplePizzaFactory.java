package books.head_first_design_patterns._04_factory.pizza_store;

/***
 * This is the factory where we create pizzas;
 * it should be the only part of our application
 * that refers to concrete Pizza classes.
 */
public class SimplePizzaFactory {

    /***
     * We define a createPizza() method in the
     * factory. This is the method all clients
     * will use to instantiate new objects.
     * <p>
     * This method can be declared statically.
     *
     * @param type The type of the pizza to make.
     * @return The concrete class of that typed Pizza.
     */
    public Pizza createPizza(String type) {

        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}
