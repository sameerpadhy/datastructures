package com.sameer.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,3,1,4,5,2};
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println("\n"+"After sorting");
		Arrays.stream(insertionSort(arr)).forEach(System.out::print);

	}

	private static int[] insertionSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<arr.length;i++) {
			int value=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>value)
			{
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=value;
			
		}
		return arr;
	}

}
