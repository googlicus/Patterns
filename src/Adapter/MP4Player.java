package Adapter;

/**
 * Created by Parent on 05.11.2016.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("play mp4 file " + fileName);
    }
}
