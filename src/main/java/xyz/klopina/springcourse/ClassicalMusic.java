package xyz.klopina.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{
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
