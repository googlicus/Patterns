package AbstractFactory;

/**
 * Created by Данил on 25.10.2016.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice == null)
            return null;
        if (choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }

        return null;
    }
}
