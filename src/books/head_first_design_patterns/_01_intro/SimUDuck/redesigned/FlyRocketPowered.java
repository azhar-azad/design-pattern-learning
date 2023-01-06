package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
