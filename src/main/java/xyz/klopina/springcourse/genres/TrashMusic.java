package xyz.klopina.springcourse.genres;

import xyz.klopina.springcourse.Music;

public class TrashMusic implements Music {
    @Override
    public String getSong() {
        return "TrashMusic";
    }
}
