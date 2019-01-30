package geekbrains.J2L2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        gameInt();
        for (; ;) {
            System.out.println("Сыграем еще разок? 1 - Играем / 0 - Уже наигрался");
            int a = sc.nextInt();
            if (a == 1) {
                gameInt();
            } else if (a == 0){
                break;
            } else {
                System.out.println("Нет уж! Вводи 1 или 0!");
            }
        }
        gameString();
    }

    private static void gameInt() {
        Random rand = new Random();
        int x = rand.nextInt(9);
        System.out.println("Игра: Угадай число!");
        for (int i = 0; i<3; i++) {
            System.out.print("Введите число от 0 до 9: ");
            int a = sc.nextInt();
            if (a == x) {
                System.out.println("Вы выиграли!");
                break;
            } else if (a > x) {
                System.out.println("Загаданное число меньше!");
            } else if (a < x) {
                System.out.println("Загаданное число больше!");
            }
            if (i == 2){
                System.out.println("Вы проиграли! Загаданное число было " + x);
            }
        }
    }

    private static void gameString() {
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String answer;
        String random = (words[new Random().nextInt(words.length)]);
//        System.out.println(random);
        System.out.println("Игра: Угадай слово!");
            for (;;) {
                System.out.print("Введите слово: ");
                answer = sc.nextLine();
                if (answer.equals(random)) {
                    System.out.println("Правильно! мы загадали: " + random);
                    break;
                } else {
                    for (int i = 0; i<answer.length() && i<random.length(); i++) {
                        char a = answer.charAt(i);
                        char b = random.charAt(i);
                        if (a == b) {
                            System.out.print(a);
                        } else {
                            System.out.print("###############");
                            break;
                        }
                    }
                    System.out.println();
                }
            }
    }
}
