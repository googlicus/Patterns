package Factory;

/**
 * Created by Данил on 22.10.2016.
 */
public class FactoryDemo {

    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        circle.draw();

        Shape square = factory.getShape("square");
        square.draw();

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();
    }
}
