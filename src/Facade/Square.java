package Facade;

/**
 * Created by Parent on 04.12.2016.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw() calling");
    }
}
