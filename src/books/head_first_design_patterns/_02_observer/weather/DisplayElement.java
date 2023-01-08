package books.head_first_design_patterns._02_observer.weather;

/***
 * An interface for all display elements to implement.
 * The display elements just need to implement a
 * display() method.
 */
public interface DisplayElement {

    /***
     * The DisplayElement interface just includes one method, display(),
     * that we will call when the display element needs to be displayed.
     */
    void display();
}
