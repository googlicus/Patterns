package Bridge;

/**
 * Created by Данил on 13.11.2016.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("Drawing rec circle with radius %d, x %d, y %d", radius, x, y));
    }
}
