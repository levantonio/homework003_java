package homework3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

;

//Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class Task2 {

    public static void delEvenNum() {
        int[] arr = createArray();
        System.out.println("Начальный массив -");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nМассив без чётных чисел -");
        delEvenNumToArray(arr);


    }


    public static void delEvenNumToArray(int[] arr) {

        ArrayList<Integer> oddList = new ArrayList<>();

        for (int j : arr) {
            if (j % 2 != 0) {
                oddList.add(j);
            }
        }

        Integer[] oddArr = new Integer[oddList.size()];
        oddArr = oddList.toArray(oddArr);

        System.out.println(Arrays.toString(oddArr));
    }


    public static int[] createArray() {
        int sizeArray = 15;
        int[] array = new int[sizeArray];
        Random rand = new Random();
        for (int i = 0; i < sizeArray; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;

    }

}

