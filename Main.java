import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("Барсик", 15));
        cats.add(new Cat("Рыжик", 10));
        cats.add(new Cat("Пушок", 20));
        Plate plate = new Plate(0);

        for (Cat cat:cats) {
            cat.info();
            System.out.println(String.format("Сытость %b", cat.isFill));
        }
        plate.info();
        plate.increaseFood();
        plate.info();
        for (Cat cat:cats) {
            cat.info();
            cat.eat(plate);
            System.out.println(cat.isFill);
        }
    }
}
