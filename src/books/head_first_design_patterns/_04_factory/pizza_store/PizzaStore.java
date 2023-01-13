package books.head_first_design_patterns._04_factory.pizza_store;

/***
 * This is the client of the factory.
 * PizzaStore now goes through the
 * SimplePizzaFactory to get instances of pizza.
 */
public class PizzaStore {

    /***
     * Reference to a SimplePizzaFactory.
     */
    SimplePizzaFactory factory;

    /***
     * PizzaStore gets the factory passed
     * to it in the constructor.
     * @param factory The factory reference.
     */
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        /*
         * The orderPizza() method uses the factory
         * to create its pizzas by simple passing
         * on the type of the order.
         */
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
