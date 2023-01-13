package books.head_first_design_patterns._03_decorator.starbuzz;

/***
 * Mocha is a decorator.
 * So we extend CondimentDecorator.
 */
public class Mocha extends CondimentDecorator {

    /***
     * We're going to instantiate Mocha with a reference to a Beverage.
     * This class inherits the Beverage instance variable to hold the
     * beverage we are wrapping.
     * @param beverage that we're wrapping to the decorator's constructor.
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /***
     * We want our description to include not only the beverage-say "Dark Roast" -
     * but also each item decorating the beverage (for instance, "Dark Roast, Mocha").
     * @return the description that holds both the beverage description and condiment description.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /***
     * We need to compute the cost of our beverage with Mocha.
     * First, we delegate the call to the object we're decorating
     * so that it can compute the cost; then, we add the cost of
     * Mocha to the result.
     * @return the cost of the beverage include the cost of the decorator(Mocha).
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
