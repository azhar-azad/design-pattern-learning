package books.head_first_design_patterns._01_intro.SimUDuck;

public class RubberDuck extends Duck implements Quackable {

    @Override
    protected void display() {
        // looks like a rubber duck
    }

    @Override
    public void quack() {
        // implementation of squeak
    }
}
