package books.head_first_design_patterns._04_factory.pizza_store_franchised;

/***
 * PizzaStore is now abstract (see why below).
 * <p>
 * Each subclass provides an implementation of the createPizza() method,
 * overriding the abstract createPizza() method in Pizza Store, while all
 * subclasses make use of the orderPizza() method defined in Pizza Store.
 * <p>
 * We could make the orderPizza() method final if we really wanted to
 * enforce this.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        /*
         * createPizza is back to being a
         * call to a method in the PizzaStore
         * rather t han on a factory object.
         */
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /***
     * Now we've moved our factory object
     * to this method.
     * <p>
     * Our "factory method" is now abstract
     * in PizzaStore.
     * <p>
     * All the responsibility for instantiating
     * Pizzas has been moved into a method that
     * acts as a factory.
     *
     * @param type Pizza type.
     * @return Pizza object of that type.
     */
    protected abstract Pizza createPizza(String type);
}
