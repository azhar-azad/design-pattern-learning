package books.head_first_design_patterns._04_factory.pizza_store;

public class SimplePizzaFactory {

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
