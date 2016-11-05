package Adapter;

/**
 * Created by Parent on 05.11.2016.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer mediaPlayer;

    public MediaAdapter(AudioType audioType){
        if (audioType != null && audioType == AudioType.VLC){
            mediaPlayer = new VLCPlayer();
        } else if (audioType != null && audioType == AudioType.MP4){
            mediaPlayer = new MP4Player();
        } else {
            mediaPlayer = new VLCPlayer();
        }
    }

    @Override
    public void play(AudioType audioType, String fileName) {
        if (audioType == AudioType.VLC){
            mediaPlayer.playVLC(fileName);
        } else if (audioType == AudioType.MP4){
            mediaPlayer.playMP4(fileName);
        }
    }
}
