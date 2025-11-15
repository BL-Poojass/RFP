package com.bridgelabz.maxmingenerics;

//Generic Class for Refactor 2
public class Maximum<T extends Comparable<T>> {
 T x, y, z;

 public Maximum(T x, T y, T z) {
     this.x = x;
     this.y = y;
     this.z = z;
 }

 public T testMaximum() {
     return MaxFinder.testMaximum(x, y, z);
 }
}
