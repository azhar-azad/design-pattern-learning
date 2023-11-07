package articles.digitalocean.chainofresponsiblity;

import java.util.Scanner;

/***
 * Creating the Chain
 */
public class ATMDispenseChain {

    private final DispenseChain firstChain;

    public ATMDispenseChain() {
        // initialize the chain
        this.firstChain = new TK1000Dispenser();
        DispenseChain secondChain = new TK500Dispenser();
        DispenseChain thirdChain = new TK200Dispenser();
        DispenseChain fourthChain = new TK1000Dispenser();

        // set the chain of responsibility
        firstChain.setNextChain(secondChain);
        secondChain.setNextChain(thirdChain);
        thirdChain.setNextChain(fourthChain);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ATMDispenseChain atmDispenseChain = new ATMDispenseChain();

        System.out.println("Enter amount to dispense: ");
        int amount = scanner.nextInt();
        if (amount % 100 != 0) {
            System.out.println("Amount should be in multiple of 100s");
            return;
        }

        // process the request
        atmDispenseChain.firstChain.dispense(new Currency(amount));
    }
}
