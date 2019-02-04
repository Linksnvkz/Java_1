package geekbrains.J1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final Scanner sc = new Scanner(System.in);
    public static final Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            try {
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } catch (Exception exc) {
                System.out.println("Ввести можно только цифры!");
                x = -1;
                y = -1;
            }
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        try {
            System.out.println("Хм... Что если... 101110101101");
            Thread.sleep(1500);
        } catch (Exception ignored) {
        }
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    //Проверяем победу. Проверяем все столбцы, строки и диагонали.
    public static boolean checkWin(char symbol) {
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[i][0] == map[i][1] && map[i][1] == map[i][2] && map[i][0] == symbol) {
                return true;
            }
        }
        //проверка вертикали
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[0][i] == map[1][i] && map[1][i] == map[2][i] && map[0][i] == symbol) {
                return true;
            }
        }
        //проверка главной диагонали
        if (map[0][0] == map[1][1] && map[1][1] == map[2][2] && map[0][0] == symbol) {
            return true;
        }
        //проверка второй диагонали
        if (map[0][2] == map[1][1] && map[1][1] == map[2][0] && map[0][2] == symbol) {
            return true;
        }
        return false;
    }
}
