package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("I'm a model duck");
    }
}
