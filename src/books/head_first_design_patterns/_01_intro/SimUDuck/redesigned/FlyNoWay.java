package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

/***
 * Here's the implementation for all ducks that can't fly.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        // do nothing - can't fly
        System.out.println("I can't fly");
    }
}
