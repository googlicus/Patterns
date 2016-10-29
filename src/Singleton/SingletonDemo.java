package Singleton;

/**
 * Created by Parent on 29.10.2016.
 */
public class SingletonDemo {

    public static void main(String[] args){
        // Compile error
//        SingleObject obj = new SingleObject();

        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
