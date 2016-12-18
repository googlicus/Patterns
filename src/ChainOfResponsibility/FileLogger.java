package ChainOfResponsibility;

/**
 * Created by Parent on 18.12.2016.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File logger: " + message);
    }
}
