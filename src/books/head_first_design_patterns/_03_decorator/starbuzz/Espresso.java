package books.head_first_design_patterns._03_decorator.starbuzz;

public class Espresso extends Beverage {

    /***
     * To take care of the description, we set this
     * in the constructor for the class.
     */
    public Espresso() {
        description = "Espresso";
    }

    /***
     * We need to compute the cost of an Espresso.
     * We don't need to worry about adding in condiments in this class.
     * We just need to return the price of an Espresso: $1.99.
     * @return the pre-defined Espresso price from menu.
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
