package Command;

/**
 * Created by Данил on 25.12.2016.
 */
public class CommandDemo {

//    Command pattern is a data driven design pattern and falls under behavioral pattern category.
// A request is wrapped under an object as command and passed to invoker object.
// Invoker object looks for the appropriate object which can handle this command and
// passes the command to the corresponding object which executes the command.

    public static void main(String[] args){
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
