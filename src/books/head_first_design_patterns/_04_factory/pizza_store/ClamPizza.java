package books.head_first_design_patterns._04_factory.pizza_store;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Thin Crust";
        sauce = "White garlic Sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
