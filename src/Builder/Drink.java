package Builder;

/**
 * Created by Parent on 30.10.2016.
 */
public abstract class Drink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
