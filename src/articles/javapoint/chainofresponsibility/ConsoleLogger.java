package articles.javapoint.chainofresponsibility;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLog(String message) {
        System.out.println("CONSOLE LOGGER: " + message);
    }
}
