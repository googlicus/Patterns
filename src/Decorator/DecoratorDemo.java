package Decorator;

/**
 * Created by Parent on 27.11.2016.
 */
public class DecoratorDemo {
    public static void main(String[] args){
        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(rectangle);

        System.out.println("Normal rectangle");
        rectangle.draw();
        System.out.println("Red rectangle");
        redRectangle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Red circle");
        redCircle.draw();
    }
}
