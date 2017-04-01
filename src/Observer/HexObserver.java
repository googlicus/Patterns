package Observer;

/**
 * Created by Данил on 01.04.2017.
 */
public class HexObserver extends Observer {

    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex string: " + Integer.toHexString(subject.getState()));
    }
}
