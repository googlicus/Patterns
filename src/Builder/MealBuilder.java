package Builder;

/**
 * Created by Parent on 30.10.2016.
 */
public class MealBuilder {

    public Meal prepareBeefCoke(){
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareChickenJuice(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Juice());
        return meal;
    }
}
