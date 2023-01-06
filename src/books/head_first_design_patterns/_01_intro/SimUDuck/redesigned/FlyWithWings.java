package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

/***
 * Here's the implementation of flying for all ducks that have wings.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        // implements duck flying
        System.out.println("I'm flying!");
    }
}
