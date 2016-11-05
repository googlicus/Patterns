package Adapter;

/**
 * Created by Parent on 05.11.2016.
 */
public class AdapterDemo {
    public static void main(String[] args){
        AudioPlayer player = new AudioPlayer();

        player.play(AudioType.MP4, "my fav mp4 file");
        player.play(AudioType.MP3, "my fav mp3 file");
        player.play(AudioType.VLC, "my fav vlc file");
    }
}
