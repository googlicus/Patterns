package Facade;

/**
 * Created by Parent on 04.12.2016.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw() calling");
    }
}
