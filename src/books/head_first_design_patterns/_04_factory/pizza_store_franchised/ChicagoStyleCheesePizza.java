package books.head_first_design_patterns._04_factory.pizza_store_franchised;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {

        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    /***
     * The Chicago-style pizza also overrides the cut()
     * method so that the pieces are cut into squares.
     */
    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
