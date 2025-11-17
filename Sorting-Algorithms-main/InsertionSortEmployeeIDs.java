package Sorting;

public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        int[] employeeIDs = {1702, 1601, 1803, 1504, 1905, 1406, 1707};

        System.out.println("Before Sorting:");
        printArray(employeeIDs);

        insertionSort(employeeIDs);

        System.out.println("After Sorting:");
        printArray(employeeIDs);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}