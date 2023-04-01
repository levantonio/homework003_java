import homework3.Task1;
import homework3.Task2;
import homework3.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1.runMergeSort();
        Task2.delEvenNum();
        int[] array = Task3.createArray();
        System.out.println("Начальный массив " + Arrays.toString(array));
        Task3.ariphmetic(array);
    }
}