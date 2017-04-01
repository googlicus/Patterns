package Observer;

/**
 * Created by Данил on 01.04.2017.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal string:" + Integer.toOctalString(subject.getState()));
    }
}
