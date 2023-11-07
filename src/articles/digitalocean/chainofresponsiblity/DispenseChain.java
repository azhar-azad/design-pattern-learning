package articles.digitalocean.chainofresponsiblity;

/***
 * This interface has a method to define the next processor in the chain
 * and the method that will process the request.
 * Different processor classes need to implement the DispenseChain interface and
 * provide implementation of dispense methods. Since we are developing our system
 * to work with four types of currency bills - 1000TK, 500TK, 200TK and 100TK, we
 * will create four concrete implementations.
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency currency);
}
