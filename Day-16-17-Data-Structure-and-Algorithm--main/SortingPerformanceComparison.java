import java.util.Arrays;
import java.util.Random;

public class SortingPerformanceComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 100000};
        for (int size : sizes) {
            int[] array = generateRandomArray(size);
            int[] bubbleArray = Arrays.copyOf(array, array.length);
            int[] mergeArray = Arrays.copyOf(array, array.length);
            int[] quickArray = Arrays.copyOf(array, array.length);

            long startTime = System.nanoTime();
            bubbleSort(bubbleArray);
            long bubbleTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            mergeSort(mergeArray, 0, mergeArray.length - 1);
            long mergeTime = System.nanoTime() - startTime;

            startTime = System.nanoTime();
            quickSort(quickArray, 0, quickArray.length - 1);
            long quickTime = System.nanoTime() - startTime;

            System.out.println("Size: " + size);
            System.out.println("Bubble Sort Time: " + bubbleTime / 1e6 + " ms");
            System.out.println("Merge Sort Time: " + mergeTime / 1e6 + " ms");
            System.out.println("Quick Sort Time: " + quickTime / 1e6 + " ms");
            System.out.println();

            if (size >= 100000) {
                System.out.println("Bubble sort is impractical for large datasets.");
                break;
            }
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }
        System.arraycopy(temp, 0, array, left, temp.length);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}
