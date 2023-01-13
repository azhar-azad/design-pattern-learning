package books.head_first_design_patterns._03_decorator.starbuzz;

/***
 * Whip is a decorator.
 * So we extend CondimentDecorator.
 */
public class Whip extends CondimentDecorator {

    /***
     * We're going to instantiate Whip with a reference to a Beverage.
     * This class inherits the Beverage instance variable to hold the
     * beverage we are wrapping.
     * @param beverage that we're wrapping to the decorator's constructor.
     */
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    /***
     * We want our description to include not only the beverage-say "Dark Roast" -
     * but also each item decorating the beverage (for instance, "Dark Roast, Whip").
     * @return the description that holds both the beverage description and condiment description.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    /***
     * We need to compute the cost of our beverage with Whip.
     * First, we delegate the call to the object we're decorating
     * so that it can compute the cost; then, we add the cost of
     * Whip to the result.
     * @return the cost of the beverage include the cost of the decorator(Whip).
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
