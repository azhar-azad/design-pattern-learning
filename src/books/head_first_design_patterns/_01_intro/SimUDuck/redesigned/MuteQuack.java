package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

/***
 * Quacks that make no sound at all.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // do nothing - can't quack!
        System.out.println("<< Silence >>");
    }
}
