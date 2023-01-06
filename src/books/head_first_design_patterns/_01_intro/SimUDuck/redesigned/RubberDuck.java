package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    protected void display() {
        System.out.println("I'm a rubber duck. I can't quack or fly but I can squeak");
    }
}
