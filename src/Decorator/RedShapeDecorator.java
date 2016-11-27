package Decorator;

/**
 * Created by Parent on 27.11.2016.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        drawBorder();
    }

    private void drawBorder() {
        System.out.println("Extra func: red border");
    }
}
