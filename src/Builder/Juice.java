package Builder;

/**
 * Created by Parent on 30.10.2016.
 */
public class Juice extends Drink {
    @Override
    public String name() {
        return "Juice drink";
    }

    @Override
    public float price() {
        return 2.7f;
    }
}
