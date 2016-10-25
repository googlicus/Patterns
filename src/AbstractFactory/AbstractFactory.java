package AbstractFactory;

/**
 * Created by Данил on 25.10.2016.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
