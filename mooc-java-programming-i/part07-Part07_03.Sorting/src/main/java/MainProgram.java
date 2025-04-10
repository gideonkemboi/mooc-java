
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
         int[] array = {-1, 3, 1, 7, 4, 5, 2, 4, 3};

        System.out.println(MainProgram.indexOfSmallestFrom(array, 1));
        MainProgram.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int n : array) {
            if (n < smallest) {
                smallest = n;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = MainProgram.smallest(array);
        int index = 0;

        for (int n : array) {
            if (n == smallest) {
                return index;
            }

            index++;
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int length = table.length - startIndex;
        int[] numbers = new int[length];
        int j = 0;

        for (int i = startIndex; i < table.length; i++) {
            numbers[j] = table[i];
            j++;
        }

        return startIndex + MainProgram.indexOfSmallest(numbers);
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallestIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}
