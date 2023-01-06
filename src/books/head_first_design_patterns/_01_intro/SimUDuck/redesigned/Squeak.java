package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

/***
 * Quacks that squeak.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        // rubber duckie squeak
        System.out.println("Squeak");
    }
}
