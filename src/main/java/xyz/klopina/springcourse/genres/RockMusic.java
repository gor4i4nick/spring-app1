package xyz.klopina.springcourse.genres;

import org.springframework.stereotype.Component;
import xyz.klopina.springcourse.Music;

public class RockMusic implements Music {
    @Override
    public String  getSong() {
        return "RockMusic";
    }
}
