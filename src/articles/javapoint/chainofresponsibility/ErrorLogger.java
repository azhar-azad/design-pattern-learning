package articles.javapoint.chainofresponsibility;

public class ErrorLogger extends Logger {
    public ErrorLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLog(String message) {
        System.out.println("ERROR LOGGER: " + message);
    }
}
