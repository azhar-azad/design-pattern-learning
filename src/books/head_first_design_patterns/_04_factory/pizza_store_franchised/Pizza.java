package books.head_first_design_patterns._04_factory.pizza_store_franchised;

import java.util.ArrayList;
import java.util.List;

/***
 * Abstract Pizza class, all the concrete pizzas
 * will derive from this.
 * <p>
 * We defined Pizza as an abstract class with
 * some helpful implementations that can be overridden.
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        toppings.forEach(topping -> System.out.println("  " + topping));
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String toString() {
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n")
                .append(dough).append("\n")
                .append(sauce).append("\n");
        for (String topping: toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
