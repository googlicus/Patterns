package Prototype;

/**
 * Created by Parent on 04.11.2016.
 */
public class Rectangle extends Shape {
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Rectangle draw() method call");
    }
}
