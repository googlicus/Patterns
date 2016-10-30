package Builder;

/**
 * Created by Parent on 30.10.2016.
 */
public class BuilderDemo {
    public static void main(String[] args){
        MealBuilder builder = new MealBuilder();

        System.out.println("Meal with beef burger and coke-cola");
        Meal mealB = builder.prepareBeefCoke();
        mealB.showItems();
        System.out.println("Total cost:" + mealB.getCost());

        System.out.println("Meal with chicken burger and juice");
        Meal mealC = builder.prepareChickenJuice();
        mealC.showItems();
        System.out.println("Total cost:" + mealC.getCost());
    }
}
