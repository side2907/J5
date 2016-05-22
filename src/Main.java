import java.util.Scanner;

/**
 * Created by Demo on 20.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animals[] animals = new Animals[3];
        animals[0] = new Cats();
        animals[1] = new Horses();
        animals[2] = new Fish();
        do{
            System.out.println("Выберите животное: 1 - Кошка, 2 - Лошадь, 3 - Рыбка, 0 - выход.");
            int a = scanner.nextInt();
            System.out.println("Выберите действие: 1 - прыжок, 2 - голос, 3 - плыть, 4 - лежать, 0 - выход.");
            int b = scanner.nextInt();
            if(a==0||b==0) {
                System.out.println("Выход...");
                break;
            }
            if(a<0||a>3||b<0||b>4) {
                System.out.println("Выбор не распознан... Попробуйте заново\n");
                continue;
            }
            a--;
            System.out.println();
            animals[a].Name();
            switch (b){
                case 1:
                    animals[a].Jump();
                    break;
                case 2:
                    animals[a].Voice();
                    break;
                case 3:
                    animals[a].Swim();
                    break;
                case 4:
                    animals[a].Lay();
                    break;
            }
            System.out.println();
        }while (true);

    }
}