package Adapter;

/**
 * Created by Parent on 05.11.2016.
 */
public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("play vlc audio " + fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
