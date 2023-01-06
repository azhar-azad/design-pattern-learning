package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * Duck Behaviors
     */
    // Fly
    protected void performFly() {
        flyBehavior.fly();
    }

    // Each Duck has a reference to something that implements the QuackBehavior interface.
    // Rather than handling the quack behavior itself, the Duck object delegates that behavior to
    // the object referenced by quackBehavior.
    protected void performQuack() {
        quackBehavior.quack();
    }

    // All ducks swim
    protected void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    // display() method is abstract, since all duck subtype look different
    protected abstract void display();

    /**
     * Constructors, Getters and Setters
     */
    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
