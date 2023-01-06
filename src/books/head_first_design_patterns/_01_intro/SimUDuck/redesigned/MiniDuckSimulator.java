package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.performQuack();
        mallard.performFly();
        System.out.println();

        Duck redHead = new RedheadDuck();
        redHead.display();
        redHead.swim();
        redHead.performQuack();
        redHead.performFly();
        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.swim();
        rubber.performQuack();
        rubber.performFly();
        System.out.println();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.swim();
        decoy.performQuack();
        decoy.performFly();
        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.swim();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
        System.out.println();
    }
}
