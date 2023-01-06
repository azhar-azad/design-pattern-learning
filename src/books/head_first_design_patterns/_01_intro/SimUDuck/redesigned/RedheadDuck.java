package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("I'm a real red head duck");
    }
}
