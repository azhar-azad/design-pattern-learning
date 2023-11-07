package articles.geeksforgeeks.chainofresponsibility;

public class TestChain {

    public static void main(String[] args) {

        Chain chain = new Chain();

        // Calling chain of responsibility
        chain.process(new Number(15));
        chain.process(new Number(-15));
        chain.process(new Number(0));
        chain.process(new Number(30));
    }
}
