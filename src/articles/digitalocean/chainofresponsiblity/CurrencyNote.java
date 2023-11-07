package articles.digitalocean.chainofresponsiblity;

public enum CurrencyNote {

    THOUSAND(1000),
    FIVE_HUNDRED(500),
    TWO_HUNDRED(200),
    HUNDRED(100);

    private final int amount;

    CurrencyNote(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
