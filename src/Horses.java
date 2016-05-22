/**
 * Created by Demo on 20.05.2016.
 */
public class Horses extends Animals {
    String name = "Лошадь", voice = "И-Го-Го";
    int jump = 250, swim = 2;

    @Override
    void Name(){
        System.out.println("Это животное "+name);
    }

    @Override
    void Jump(){
        System.out.println(name+" может прыгать на "+jump);
    }

    @Override
    void Voice(){
        System.out.println(name+" издает звук "+voice);
    }

    @Override
    void Swim(){
        System.out.println(name+" может плыть со скоростью "+swim);
    };
}
