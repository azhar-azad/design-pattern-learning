package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    protected void display() {
        System.out.println("I'm a decoy duck made of wood. I can't quack or fly");
    }
}
