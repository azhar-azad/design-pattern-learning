package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

/***
 * Quacks that really quack.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        // implements duck quacking
        System.out.println("Quack");
    }
}
