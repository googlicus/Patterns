package Proxy;

/**
 * Created by Данил on 11.12.2016.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFile(fileName);
    }

    private void loadFile(String fileName){
        System.out.println("Loading "+ fileName);
    }

    @Override
    public void display() {
        System.out.println("Display " + fileName);
    }
}
