package articles.digitalocean.chainofresponsiblity;

public class TK1000Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {

        if (currency.getAmount() >= CurrencyNote.THOUSAND.getAmount()) {
            int numOfNoteToDispense = currency.getAmount() / CurrencyNote.THOUSAND.getAmount();
            int remainingMoneyToDispense = currency.getAmount() % CurrencyNote.THOUSAND.getAmount();
            System.out.println("Dispensing " + numOfNoteToDispense + " 1000TK note");

            if (remainingMoneyToDispense != 0)
                this.chain.dispense(new Currency(remainingMoneyToDispense));
            else
                System.out.println("Dispensing completed");
        } else {
            this.chain.dispense(currency);
        }
    }
}
