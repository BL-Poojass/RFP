package Sorting;

public class MergeSortBookPrices {
    public static void main(String[] args) {
        double[] bookPrices = {19.99, 9.99, 29.99, 4.99, 14.99, 24.99, 39.99, 7.99};

        System.out.println("Before Sorting:");
        printArray(bookPrices);

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("After Sorting:");
        printArray(bookPrices);
    }

    public static void mergeSort(double[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(double[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        for (int index = 0; index < n1; index++) {
            leftArray[index] = array[left + index];
        }
        for (int index = 0; index < n2; index++) {
            rightArray[index] = array[mid + 1 + index];
        }

        int leftIndex = 0, rightIndex = 0, arrayIndex = left;
        while (leftIndex < n1 && rightIndex < n2) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[arrayIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[arrayIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            arrayIndex++;
        }

        while (leftIndex < n1) {
            array[arrayIndex] = leftArray[leftIndex];
            leftIndex++;
            arrayIndex++;
        }

        while (rightIndex < n2) {
            array[arrayIndex] = rightArray[rightIndex];
            rightIndex++;
            arrayIndex++;
        }
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
