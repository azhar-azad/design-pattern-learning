package books.head_first_design_patterns._03_decorator.starbuzz;

/***
 * The Decorator class.
 * We need to be interchangeable with a Beverage,
 * so we extend the Beverage class.
 */
public abstract class CondimentDecorator extends Beverage {

    /***
     * Here's the Beverage that each Decorator will be wrapping.
     * Notice we are using the Beverage supertype to refer to the
     * Beverage so the Decorator can wrap ANY beverage.
     */
    protected Beverage beverage;

    /***
     * We're going to require that the condiment decorators all
     * reimplement the getDescription() method.
     * @return the description of said Beverage with Condiment.
     */
    public abstract String getDescription();
}
