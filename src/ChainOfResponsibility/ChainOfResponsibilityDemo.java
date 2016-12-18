package ChainOfResponsibility;

/**
 * Created by Parent on 18.12.2016.
 */
public class ChainOfResponsibilityDemo {

    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args){
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "info level message");
        loggerChain.logMessage(AbstractLogger.DEBUG, "debug level message");
        loggerChain.logMessage(AbstractLogger.ERROR, "error level message");
    }
}
