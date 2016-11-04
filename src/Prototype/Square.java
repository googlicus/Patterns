package Prototype;

/**
 * Created by Parent on 04.11.2016.
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square draw() method call");
    }
}
