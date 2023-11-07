package books.head_first_design_patterns._04_factory.pizza_store_franchised;

/***
 * If a franchise wants NY-style pizzas for its
 * customers, it uses the NY subclass, which has
 * its own createPizza() method, creating NY-style pizzas.
 */
public class NYPizzaStore extends PizzaStore {

    /***
     * We've got to implement createPizza(),
     * since it is abstract in PizzaStore.
     * <p>
     * Here's where we create our concrete classes.
     * For each type of Pizza we create the NY style.
     *
     * @param type Pizza type.
     * @return Pizza of that type.
     */
    @Override
    protected Pizza createPizza(String type) {

        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> null;
        };
    }
}
