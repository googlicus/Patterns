package Builder;

/**
 * Created by Parent on 30.10.2016.
 */
public class BeefBurger extends Burger {
    @Override
    public String name() {
        return "Beef burger";
    }

    @Override
    public float price() {
        return 12.6f;
    }
}
