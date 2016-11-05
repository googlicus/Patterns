package Adapter;

/**
 * Created by Parent on 05.11.2016.
 */
public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(AudioType audioType, String fileName) {
        if (audioType == AudioType.MP3){
            System.out.println("play mp3 file by default");
        } else if (audioType == AudioType.VLC || audioType == AudioType.MP4){
            MediaAdapter adapter = new MediaAdapter(audioType);
            adapter.play(audioType, fileName);
        }
        else {
            System.out.println("invalid audio type");
        }
    }
}
