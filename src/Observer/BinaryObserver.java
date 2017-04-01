package Observer;

/**
 * Created by Данил on 01.04.2017.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary string:" + Integer.toBinaryString(subject.getState()));
    }
}
