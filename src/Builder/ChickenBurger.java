package Builder;

/**
 * Created by Parent on 30.10.2016.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken burger";
    }

    @Override
    public float price() {
        return 6.8f;
    }
}
