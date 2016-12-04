package Facade;

/**
 * Created by Parent on 04.12.2016.
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle draw() calling");
    }
}
