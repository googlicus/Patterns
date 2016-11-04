package Prototype;

/**
 * Created by Parent on 04.11.2016.
 */
public class PrototypeDemo {

    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + shape1.getType());
        shape1.draw();

        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + shape2.getType());
        shape2.draw();

        Shape shape3 = ShapeCache.getShape("3");
        System.out.println("Shape:" + shape3.getType());
        shape3.draw();
    }

}
