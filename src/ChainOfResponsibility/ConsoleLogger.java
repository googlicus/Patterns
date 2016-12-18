package ChainOfResponsibility;

/**
 * Created by Parent on 18.12.2016.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Console logger: " + message);
    }
}
