package Bridge;

/**
 * Created by Данил on 13.11.2016.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
