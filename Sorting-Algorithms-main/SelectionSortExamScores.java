package Sorting;

public class SelectionSortExamScores {
    public static void main(String[] args) {
        int[] examScores = {85, 90, 78, 92, 88, 76, 95, 89};

        System.out.println("Before Sorting:");
        printArray(examScores);

        selectionSort(examScores);

        System.out.println("After Sorting:");
        printArray(examScores);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap array[i] and array[minIndex]
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
