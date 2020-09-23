package examples;

import java.util.Arrays;

public class ArraysUtilityClassDemo {

	public static void main(String[] args) {
		int ar[]= {10,22,33,11,10,10,11,22,44,22};
		System.out.println(ar);
		System.out.println(Arrays.toString(ar));//to print the contents of array
		
		Arrays.sort(ar);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(ar));
		
		int ar2[]=Arrays.copyOf(ar, ar.length+5);
		System.out.println("ar2 = "+Arrays.toString(ar2));
		
		
		//for searching binarySearch() ->prerequisite for binarySearch is your array elements 
		//should be arranged in ascending order
		System.out.println(Arrays.binarySearch(ar, 100));
		System.out.println(Arrays.binarySearch(ar, 22));
	}

}
