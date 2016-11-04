package Prototype;

/**
 * Created by Parent on 04.11.2016.
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle draw() method call");
    }
}
