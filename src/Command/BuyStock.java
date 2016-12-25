package Command;

/**
 * Created by Данил on 25.12.2016.
 */
public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
