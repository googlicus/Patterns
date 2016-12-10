package Flyweight;

/**
 * Created by Parent on 10.12.2016.
 */
public class FlyWeightDemo {
    private static final String colors[] = {"white", "black", "red", "green", "blue"};
    public static void main(String[] agrs){

        for (int i = 0; i < 20; i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRndColor());
            circle.setRadius(getRndRadius());
            circle.setX(getRndPos());
            circle.setY(getRndPos());
            circle.draw();
        }
    }

    private static String getRndColor(){
        return colors[(int) (Math.random()*colors.length)];
    }

    private static int getRndPos(){
        return (int) (Math.random()*100);
    }

    private static int getRndRadius(){
        return (int) (Math.random()*50);
    }
}
