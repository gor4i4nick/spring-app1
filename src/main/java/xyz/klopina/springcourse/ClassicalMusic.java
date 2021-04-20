package xyz.klopina.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){
    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "ClassicalMusic";
    }

    private void doMyInit() {
        System.out.println("Doing my initialization");
    }

    private void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
