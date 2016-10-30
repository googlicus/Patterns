package Builder;

/**
 * Created by Parent on 30.10.2016.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
