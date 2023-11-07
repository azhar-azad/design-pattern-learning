package articles.digitalocean.chainofresponsiblity;

public class TK100Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {

        if (currency.getAmount() >= CurrencyNote.HUNDRED.getAmount()) {
            int numOfNoteToDispense = currency.getAmount() / CurrencyNote.HUNDRED.getAmount();
            int remainingMoneyToDispense = currency.getAmount() % CurrencyNote.HUNDRED.getAmount();
            System.out.println("Dispensing " + numOfNoteToDispense + " 100TK note");

            if (remainingMoneyToDispense != 0)
                this.chain.dispense(new Currency(remainingMoneyToDispense));
            else
                System.out.println("Dispensing completed");
        } else {
            this.chain.dispense(currency);
        }
    }
}
