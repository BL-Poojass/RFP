package Sorting;

public class HeapSortJobApplicants {
    public static void main(String[] args) {
        int[] salaryDemands = {50000, 60000, 40000, 70000, 55000, 45000, 65000};

        System.out.println("Before Sorting:");
        printArray(salaryDemands);

        heapSort(salaryDemands);

        System.out.println("After Sorting:");
        printArray(salaryDemands);
    }

    public static void heapSort(int[] array) {
        int n = array.length;
        buildMaxHeap(array);
        for (int i = n - 1; i >= 0; i--) {
            // Swap array[0] and array[i]
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            maxHeapify(array, 0, i);
        }
    }

    public static void buildMaxHeap(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(array, i, n);
        }
    }

    public static void maxHeapify(int[] array, int index, int heapSize) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < heapSize && heapSize > 0 && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < heapSize && heapSize > 0 && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != index) {
            // Swap array[index] and array[largest]
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;
            maxHeapify(array, largest, heapSize);
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
