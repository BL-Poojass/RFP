package Sorting;

public class BubbleSortStudentMarks {
    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 78, 92, 88, 76, 95, 89};

        System.out.println("Before Sorting:");
        printArray(studentMarks);

        bubbleSort(studentMarks);

        System.out.println("After Sorting:");
        printArray(studentMarks);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // If no swaps were made in a pass, the array is already sorted
            }
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
