package Builder;

/**
 * Created by Parent on 30.10.2016.
 */
public class Coke extends Drink {
    @Override
    public String name() {
        return "Coke-cola";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
