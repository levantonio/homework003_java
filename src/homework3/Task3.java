package homework3;

//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое этого списка.

import java.util.Random;

public class Task3 {


    public static void ariphmetic(int[] array) {
        int min_value = 0;
        int max_value = 0;
        int average = 0;
        for (int j : array) {
            if (j < min_value) {
                min_value = j;
            }
            if (j > max_value) {
                max_value = j;
            }
            average += j;
        }
        System.out.println("min = " + min_value);
        System.out.println("max = " + max_value);
        System.out.println("average = " + average / array.length);

    }

    public static int[] createArray() {
        int sizeArray = 10;
        int[] array = new int[sizeArray];
        Random rand = new Random();
        for (int i = 0; i < sizeArray; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;

    }
}

