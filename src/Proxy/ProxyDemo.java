package Proxy;

/**
 * Created by Данил on 11.12.2016.
 */
public class ProxyDemo {
    public static void main(String[] args){
        ProxyImage image = new ProxyImage("filo.ext");

        image.display();
        System.out.println();
        image.display();
    }
}
