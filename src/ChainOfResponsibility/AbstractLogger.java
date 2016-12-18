package ChainOfResponsibility;

/**
 * Created by Parent on 18.12.2016.
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    protected void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    abstract protected void write(String message);

    public void logMessage(int level, String message){
        if (this.level <= level){
            write(message);
        }
        if (nextLogger!=null){
            nextLogger.logMessage(level, message);
        }
    }
}
