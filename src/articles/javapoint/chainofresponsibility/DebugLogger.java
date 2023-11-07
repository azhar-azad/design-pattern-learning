package articles.javapoint.chainofresponsibility;

public class DebugLogger extends Logger {
    public DebugLogger(int levels) {
        this.levels = levels;
    }

    @Override
    protected void displayLog(String message) {
        System.out.println("DEBUG LOGGER: " + message);
    }
}
