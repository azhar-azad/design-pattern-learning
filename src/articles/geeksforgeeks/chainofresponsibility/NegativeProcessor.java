package articles.geeksforgeeks.chainofresponsibility;

public class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor nextProcessor) {
        super(nextProcessor);
    }

    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor: " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}
