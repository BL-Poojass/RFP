import java.util.*;

public class SearchComparison1 {
    public static void main(String[] args) {
        int datasetSize = 1000000;
        int[] array = new int[datasetSize];
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        // Populate array, HashSet, and TreeSet
        Random random = new Random();
        int target = random.nextInt(datasetSize);
        for (int i = 0; i < datasetSize; i++) {
            int value = random.nextInt(datasetSize);
            array[i] = value;
            hashSet.add(value);
            treeSet.add(value);
            if (value == target) {
                target = value; // Ensure target exists in all datasets
            }
        }

        // Array search
        long startTime = System.nanoTime();
        boolean arrayFound = arraySearch(array, target);
        long endTime = System.nanoTime();
        System.out.println("Array Search Time: " + (endTime - startTime) / 1e6 + " ms");

        // HashSet search
        startTime = System.nanoTime();
        boolean hashSetFound = hashSet.contains(target);
        endTime = System.nanoTime();
        System.out.println("HashSet Search Time: " + (endTime - startTime) / 1e6 + " ms");

        // TreeSet search
        startTime = System.nanoTime();
        boolean treeSetFound = treeSet.contains(target);
        endTime = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (endTime - startTime) / 1e6 + " ms");
    }

    public static boolean arraySearch(int[] array, int target) {
        for (int value : array) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
}
