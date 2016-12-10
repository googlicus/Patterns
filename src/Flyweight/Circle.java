package Flyweight;

/**
 * Created by Parent on 10.12.2016.
 */
public class Circle implements Shape {
    private int x;
    private int y;
    private String color;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Circle with x:%d, y:%d, rad:%d, color:%s", x, y, radius, color));
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
