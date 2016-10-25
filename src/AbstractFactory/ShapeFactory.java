package AbstractFactory;

/**
 * Created by Данил on 25.10.2016.
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null)
            return null;
        if (shape.equalsIgnoreCase("circle")){
            return new Circle();
        } else if (shape.equalsIgnoreCase("square")){
            return new Square();
        } else if (shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }

        return null;
    }
}
