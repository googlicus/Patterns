package Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Parent on 04.11.2016.
 */
public class ShapeCache {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape cloneShape = shapeMap.get(shapeId);
        if (cloneShape!=null){
            return (Shape)cloneShape.clone();
        }
        return null;
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
