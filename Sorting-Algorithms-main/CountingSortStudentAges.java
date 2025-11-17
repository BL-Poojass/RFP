package Sorting;

public class CountingSortStudentAges {
    public static void main(String[] args) {
        int[] studentAges = {15, 12, 18, 14, 11, 16, 13, 17, 15, 12};

        System.out.println("Before Sorting:");
        printArray(studentAges);

        countingSort(studentAges, 10, 18);

        System.out.println("After Sorting:");
        printArray(studentAges);
    }

    public static void countingSort(int[] array, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[array.length];

        // Count the frequency of each age
        for (int age : array) {
            count[age - min]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        // Copy the sorted elements to the original array
        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}