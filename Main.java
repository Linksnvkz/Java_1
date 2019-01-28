package geekbrains.J2L2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        objective1();
        objective2();
        objective3();
        objective4();
        objective5();
        objective7();
    }

    static void objective1() {
        int changeArr[] = { 1 , 0 , 1 , 0 , 0 , 1 , 1 , 0 , 0 , 0 };
        System.out.println(Arrays.toString(changeArr));

        for (int i = 0; i < changeArr.length; i++){
            if (changeArr[i] == 1) {
                changeArr[i] = 0;
            } else if (changeArr[i] == 0){
                changeArr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(changeArr));
    }

    static void objective2() {
        int result = 0;
        int[] nullArr = new int[8];
        for (int i = 0; i < nullArr.length; i++) {
            nullArr[i] = result;
            result = result + 3;
        }
        System.out.println(Arrays.toString(nullArr));
    }

    static void objective3() {
        int arrX2[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i< arrX2.length; i++) {
            if (arrX2[i] < 6) {
                arrX2[i] = arrX2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrX2));
    }

    static void objective4() {
        int arrSquare[][] = new int[5][5];
        for (int i = 0; i < arrSquare.length; i++){
            for (int j = 0; j < arrSquare.length; j++){
                if (i == j) {
                    arrSquare[i][j] = 1;
                }
                if (i == arrSquare.length - (j + 1)) {
                    arrSquare[i][j] = 1;
                }
                System.out.print("  " + arrSquare[i][j]);
            }
            System.out.println();
        }
    }

    static void objective5() {
        int maxArr[] = { 5, 4, 10, 9, 26, 5, 13, 20, 3, 15};
        int max = 0;
        int min = 0;
        System.out.println(Arrays.toString(maxArr));
        for (int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] > max) {
                max = maxArr[i];
                min = max;
            }
        }
        for (int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] < min) {
                min = maxArr[i];
            }
        }
        System.out.println("Наибольшее число: " + max);
        System.out.println("Наменьшее число: " + min);
    }

    static void objective7() {  // готов не полностью, не работает с отрицательными числами 
        int slipArr[] = { 5, 4, 10, 9, 26, 5, 13, 20, 3, 15};
        int n = 5;
        System.out.println(Arrays.toString(slipArr));
        for (int i = 0; i < slipArr.length; i++) {
            if (i >= n) {
                slipArr[i - n] = slipArr[i];
            }
            if (i >= n)
                slipArr[i] = 0;
        }
        System.out.println(Arrays.toString(slipArr));
    }
}
