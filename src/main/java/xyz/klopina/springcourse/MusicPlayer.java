package xyz.klopina.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
//
//    private String name;
//
//    private int volume;

//    public String getName() {
//        return name;
//    }
//
//
//    public int getVolume() {
//        return volume;
//    }

private List<Music> musicList = new ArrayList();

public MusicPlayer(List<Music> listMusic){
    for (int i = 0; i < listMusic.size(); i++) {
        this.musicList.add(listMusic.get(i));
    }
}



    public String playMusic() {
        Random random = new Random();
        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong();
    }
}
