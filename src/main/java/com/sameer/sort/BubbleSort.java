package com.sameer.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {3,1,5,9,2};
		
		int []sortedArr=bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(sortedArr[i]);
	}
	
	public static int[] bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr;
		
	}

}
