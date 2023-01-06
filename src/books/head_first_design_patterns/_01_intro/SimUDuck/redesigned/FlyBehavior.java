package books.head_first_design_patterns._01_intro.SimUDuck.redesigned;

/***
 * FlyBehavior is an interface that all flying classes implement.
 * All new flying classes just need to implement the fly() method.
 */
public interface FlyBehavior {
    void fly();
}
