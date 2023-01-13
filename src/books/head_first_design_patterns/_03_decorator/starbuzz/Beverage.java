package books.head_first_design_patterns._03_decorator.starbuzz;

/***
 * Beverage is an abstract class with the two methods
 * getDescription() and cost().
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    /***
     * The method getDescription() is already implemented.
     * @return the description.
     */
    public String getDescription() {
        return description;
    }

    /***
     * We need to implement cost() in the subclasses.
     * @return the cost of said beverage.
     */
    public abstract double cost();
}
