package com.bridgelabz.maxmingenerics;

import java.util.Arrays;

//Main class with all methods
public class MaxFinder {

 // UC 1, UC 2, UC 3 and Refactor 1: Generic Method for 3 variables
 public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
     T max = x;
     if (y.compareTo(max) > 0) max = y;
     if (z.compareTo(max) > 0) max = z;
     return max;
 }

 // UC 4: Generic Method with Varargs (any number of values)
 public static <T extends Comparable<T>> T testMaximum(T... elements) {
     Arrays.sort(elements);
     return elements[elements.length - 1];
 }

 // UC 5: Print the maximum using a generic method
 public static <T extends Comparable<T>> void printMax(T... elements) {
     T max = testMaximum(elements);
     System.out.println("Max value: " + max);
 }

 // Main method to run test cases
 public static void main(String[] args) {
     // ✅ UC 1: Integer test cases
     System.out.println("UC 1 - Integer Max Tests:");
     System.out.println("Max of 10, 5, 3: " + testMaximum(10, 5, 3));  // Max at 1st
     System.out.println("Max of 4, 9, 7: " + testMaximum(4, 9, 7));    // Max at 2nd
     System.out.println("Max of 1, 3, 6: " + testMaximum(1, 3, 6));    // Max at 3rd

     // ✅ UC 2: Float test cases
     System.out.println("\nUC 2 - Float Max Tests:");
     System.out.println("Max of 3.3f, 5.5f, 1.1f: " + testMaximum(3.3f, 5.5f, 1.1f));
     System.out.println("Max of 6.6f, 2.2f, 4.4f: " + testMaximum(6.6f, 2.2f, 4.4f));
     System.out.println("Max of 1.0f, 3.0f, 9.9f: " + testMaximum(1.0f, 3.0f, 9.9f));

     // ✅ UC 3: String test cases
     System.out.println("\nUC 3 - String Max Tests:");
     System.out.println("Max of Apple, Peach, Banana: " + testMaximum("Apple", "Peach", "Banana"));
     System.out.println("Max of Zebra, Cat, Dog: " + testMaximum("Zebra", "Cat", "Dog"));
     System.out.println("Max of A, B, C: " + testMaximum("A", "B", "C"));

     // ✅ Refactor 2: Using Generic Class
     System.out.println("\nRefactor 2 - Generic Class:");
     Maximum<Integer> intMax = new Maximum<>(5, 9, 7);
     System.out.println("Max of 5, 9, 7: " + intMax.testMaximum());

     Maximum<Float> floatMax = new Maximum<>(6.6f, 3.3f, 4.4f);
     System.out.println("Max of 6.6f, 3.3f, 4.4f: " + floatMax.testMaximum());

     Maximum<String> stringMax = new Maximum<>("Apple", "Banana", "Peach");
     System.out.println("Max of Apple, Banana, Peach: " + stringMax.testMaximum());

     // ✅ UC 4: Max from more than 3 values
     System.out.println("\nUC 4 - Max from More Than 3:");
     System.out.println("Max of [1, 4, 8, 3, 7]: " + testMaximum(1, 4, 8, 3, 7));

     // ✅ UC 5: Print max
     System.out.println("\nUC 5 - Print Max:");
     printMax(12, 43, 9, 77, 34);
     printMax("Cat", "Dog", "Apple");
     printMax(1.1f, 5.5f, 2.2f);
 }
}
