package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Parent on 30.10.2016.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items){
            cost+=item.price();
        }

        return cost;
    }

    public void showItems(){
        for (Item item : items){
            System.out.println(String.format("Item's name:%s, price: %f, packing: %s ",
                    item.name(), item.price(), item.packing()));
        }
    }
}
