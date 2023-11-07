package articles.digitalocean.chainofresponsiblity;

/***
 * Currency class is used to store the amount to dispense and
 * used by the chain implementation.
 */
public class Currency {

    private final int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
