import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    // Linear Search
    public static boolean linearSearch(int[] data, int target) {
        for (int value : data) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    // Binary Search
    public static boolean binarySearch(int[] data, int target) {
        int left = 0, right = data.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (data[mid] == target) return true;
            if (data[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    // Generate random dataset
    public static int[] generateRandomArray(int size, int bound) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(bound);
        }
        return array;
    }

    // Run performance test
    public static void runTest(int size, int target) {
        int[] data = generateRandomArray(size, size * 2);

        long startLinear = System.nanoTime();
        boolean foundLinear = linearSearch(data, target);
        long endLinear = System.nanoTime();

        Arrays.sort(data);

        long startBinary = System.nanoTime();
        boolean foundBinary = binarySearch(data, target);
        long endBinary = System.nanoTime();

        System.out.println("Dataset Size: " + size);
        System.out.println("Target: " + target);
        System.out.printf("Linear Search: %s in %.4f ms%n",
                (foundLinear ? "Found" : "Not Found"),
                (endLinear - startLinear) / 1_000_000.0);
        System.out.printf("Binary Search: %s in %.4f ms%n",
                (foundBinary ? "Found" : "Not Found"),
                (endBinary - startBinary) / 1_000_000.0);
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        runTest(1_000, 500);
        runTest(10_000, 5000);
        runTest(1_000_000, 123456);
    }
}
