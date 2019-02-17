package com.sameer.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {7,3,1,4,5,2};
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println("\n"+"After sorting");
		Arrays.stream(mergeSort(arr)).forEach(System.out::print);
	}

	private static int[] mergeSort(int[] arr) {
		// TODO Auto-generated method stub
		return null;
	}

}
