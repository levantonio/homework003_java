package homework3;


import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void runMergeSort() {
        int[] arr = createArray();
        System.out.println("Начальный массив -");
        System.out.println(Arrays.toString(arr) + "\n");
        mergeSort(arr);
        System.out.println("Отсортированный массив-");
        System.out.println(Arrays.toString(arr) + "\n");
    }

    public static int[] createArray() {
        int sizeArray = 15;
        int[] array = new int[sizeArray];
        Random rand = new Random();
        for (int i = 0; i < sizeArray; i++) {
            array[i] = rand.nextInt(99);
        }
        return array;

    }


    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - size; left += size * 2) {
                int right = Math.min(left + 2 * size - 1, n - 1);
                int mid = left + size - 1;
                merge(arr, temp, left, mid, right);
            }
        }
    }

    public static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        System.arraycopy(arr, left, temp, left, right - left + 1);
        int i = left, j = mid + 1;

        for (int k = left; k <= right; k++) {
            if (i > mid)
                arr[k] = temp[j++];
            else if (j > right)
                arr[k] = temp[i++];
            else if (temp[j] < temp[i])
                arr[k] = temp[j++];
            else
                arr[k] = temp[i++];
        }
    }
}




