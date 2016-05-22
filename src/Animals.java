/**
 * Created by Demo on 20.05.2016.
 */
abstract class Animals {
    abstract void Name();
    void Jump(){
        System.out.println("Это животное не умеет прыгать.");
    }
    void Voice(){
        System.out.println("Это животное не умеет издавать звуки.");
    }
    void Swim(){
        System.out.println("Это животное не умеет плавать.");
    }
    void Lay(){
        System.out.println("Это животное не умеет лежать.");
    }

}
