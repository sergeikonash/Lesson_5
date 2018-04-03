import java.util.Arrays;

public class less_5 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 6, 7, 9, 4};
        bubbleSort(arr);
        System.out.println("max number - " + getMaxFromArray(arr));
        System.out.println("min number - " + getMinFromArray(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                System.out.println(Arrays.toString(arr));
                System.out.println();
            }
            System.out.println();
            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    }

    public static int getMaxFromArray(int[] array) {
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i;
            }
        }
        return array[indexOfMax];
    }

    public static int getMinFromArray(int[] array) {
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfMin]) {
                indexOfMin = i;
            }
        }
        return array[indexOfMin];
    }
}
