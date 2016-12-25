package Command;

/**
 * Created by Данил on 25.12.2016.
 */
public class SellStock implements Order{
    private Stock stock;

    public SellStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
