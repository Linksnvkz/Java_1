import java.util.Scanner;

class Plate {
    private int food = 0;

    Plate(int food) {
        this.food = food;
    }

    void info() {
        System.out.println(String.format("В миске %d", food));
    }

    void decreaseFood(int n) {
        food-=n;
        if (food < 0) {
            food = 0;
        }
    }

    int getFood() {
        return food;
    }

    void increaseFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пополните миску:");
        int n = scanner.nextInt();
        food +=n;
    }
}
