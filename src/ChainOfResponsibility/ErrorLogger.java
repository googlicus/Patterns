package ChainOfResponsibility;

/**
 * Created by Parent on 18.12.2016.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error logger" + message);
    }
}
