package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

public class MallardDuck extends Duck {

    /**
     * A MallardDuck uses the Quack class to handle its quack, so when
     * performQuack() is called, the responsibility for the quack is
     * delegated to the Quack object and we get a real quack.
     * And, it uses FlyWithWings as its FlyBehavior type.
     */
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
