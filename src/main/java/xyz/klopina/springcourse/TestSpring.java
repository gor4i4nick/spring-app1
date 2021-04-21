package xyz.klopina.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.klopina.springcourse.config.SpringConfig;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());


//        System.out.println(musicPlayer.hashCode());
//        System.out.println(musicPlayer2.hashCode());
//
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);


        context.close();
    }
}
