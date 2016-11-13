package Bridge;

/**
 * Created by Данил on 13.11.2016.
 */
public class BridgeDemo {
    public static void main(String[] args){
        Shape redCircle = new Circle(new RedCircle(), 100, 10, 15);
        Shape greenCircle = new Circle(new GreenCircle(), 150, 25, 25);

        redCircle.draw();
        greenCircle.draw();
    }
}
