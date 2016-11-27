package Decorator;

/**
 * Created by Parent on 27.11.2016.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape){
        this.decoratedShape = shape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
