package com.sameer.arrays;

public class MissingElementInDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//given 2 arrays find the missing element in 2nd duplicate array
		int first[]= {9,8,7,6,5,4};
		int second[]= {9,7,6,5,4};
		int xor1=first[0];
		int xor2=second[0];
		
		for(int i=1;i<first.length;i++) {
			xor1=xor1^first[i];
		}
		
		for(int i=1;i<second.length;i++) {
			xor2=xor2^second[i];
		}
		
		System.out.println(xor1^xor2);

	}

}
