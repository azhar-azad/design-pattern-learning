package books.head_first_design_patterns._04_factory.pizza_store_franchised;

/***
 * By using the California subclass, we get an
 * implementation of createPizza() with
 * California ingredients.
 */
public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        return switch (type) {
            case "cheese" -> new CaliforniaStyleCheesePizza();
            case "veggie" -> new CaliforniaStyleVeggiePizza();
            case "clam" -> new CaliforniaStyleClamPizza();
            case "pepperoni" -> new CaliforniaStylePepperoniPizza();
            default -> null;
        };
    }
}
