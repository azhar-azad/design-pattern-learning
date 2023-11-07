package articles.javapoint.chainofresponsibility;

public abstract class Logger {

    public final static int OUTPUT_INFO = 1;
    public final static int ERROR_INFO = 2;
    public final static int DEBUG_INFO = 3;

    protected int levels;

    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String message) {
        if (this.levels <= levels) {
            displayLog(message);
        }
        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(levels, message);
        }
    }

    protected abstract void displayLog(String message);
}
