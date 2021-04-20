package xyz.klopina.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.color.CMMException;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}
