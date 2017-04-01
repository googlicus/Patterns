package Observer;

/**
 * Created by Данил on 01.04.2017.
 */
public class ObserverDemo {

    public static void main(String[] args){
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(19);
        subject.setState(90);
    }
}
