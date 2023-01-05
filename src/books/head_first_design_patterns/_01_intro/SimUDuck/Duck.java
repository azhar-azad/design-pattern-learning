package books.head_first_design_patterns._01_intro.SimUDuck;

/***
 * Duck superclass that implements all common duck behaviours.
 *
 * Subclasses will inherit the behaviours.
 */
public abstract class Duck {

    protected String duckProp1;
    protected String duckProp2;

    /**
     * Duck Behaviors
     */
    // All ducks swim
    protected void swim() {

    }

    // display() method is abstract, since all duck subtype look different
    protected abstract void display();

    /**
     * Constructors, Getters and Setters
     */
    public Duck() {
    }

    public Duck(String duck_prop1, String duckProp2) {
        this.duckProp1 = duck_prop1;
        this.duckProp2 = duckProp2;
    }

    public String getDuckProp1() {
        return duckProp1;
    }

    public void setDuckProp1(String duckProp1) {
        this.duckProp1 = duckProp1;
    }

    public String getDuckProp2() {
        return duckProp2;
    }

    public void setDuckProp2(String duckProp2) {
        this.duckProp2 = duckProp2;
    }
}
