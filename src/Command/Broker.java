package Command;

import java.util.ArrayList;

/**
 * Created by Данил on 25.12.2016.
 */
public class Broker {
    private ArrayList<Order> orders = new ArrayList<>();

    public void takeOrder(Order order){
        orders.add(order);
    }

    public void placeOrders(){
        for (Order order: orders){
            order.execute();
        }
        orders.clear();
    }
}
