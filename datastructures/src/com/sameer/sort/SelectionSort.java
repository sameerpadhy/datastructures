package com.sameer.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,3,1,4,5,2};
		Arrays.stream(arr).forEach(System.out::print);
		System.out.println("\n"+"After sorting");
		Arrays.stream(selectionSort(arr)).forEach(System.out::print);

	}

	private static int[] selectionSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}	
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
		return arr;
	}
	
}
