/**
 * Created by Demo on 20.05.2016.
 */
public class Fish extends Animals {
    String name = "Рыбка";
    int swim = 10;

    @Override
    void Name(){
        System.out.println("Это животное "+name);
    }

    @Override
    void Swim(){
        System.out.println(name+" может плыть со скоростью "+swim);
    }
}
