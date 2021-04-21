package xyz.klopina.springcourse.genres;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import xyz.klopina.springcourse.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization classicalMusic");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destruction classicalMusic");
    }

    @Override
    public String getSong() {
        return "ClassicalMusic";
    }


}
