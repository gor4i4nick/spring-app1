package xyz.klopina.springcourse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import xyz.klopina.springcourse.*;
import xyz.klopina.springcourse.genres.ClassicalMusic;
import xyz.klopina.springcourse.genres.RockMusic;
import xyz.klopina.springcourse.genres.TrashMusic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public TrashMusic trashMusic(){
        return new TrashMusic();
    }
    @Bean
    public MusicPlayer musicPlayer() {
       return new MusicPlayer(musicList());
    }
    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(), rockMusic(), trashMusic());
    }


}
