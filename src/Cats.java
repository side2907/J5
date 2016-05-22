/**
 * Created by Demo on 20.05.2016.
 */
public class Cats extends Animals {
    String name = "Кошка", voice = "Мяу";
    int jump = 150;

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
    void Lay(){
        System.out.println(name+" может лежать");
    }

}
