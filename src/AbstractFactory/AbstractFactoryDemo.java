package AbstractFactory;

/**
 * Created by Данил on 25.10.2016.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args){
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        colorFactory.getColor("red").fill();
        colorFactory.getColor("blue").fill();
        colorFactory.getColor("green").fill();

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        shapeFactory.getShape("square").draw();
        shapeFactory.getShape("rectangle").draw();
        shapeFactory.getShape("circle").draw();
    }
}
