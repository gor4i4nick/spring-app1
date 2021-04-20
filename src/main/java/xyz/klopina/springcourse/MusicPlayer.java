package xyz.klopina.springcourse;

public class MusicPlayer {
    Music music;
    String name;
    int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic(){
    System.out.println("Playing: " + music.getSong());
}
}
