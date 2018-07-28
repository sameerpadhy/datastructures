package com.sameer.list;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aList= {1,2,3,8,9};
		int[] bList= {5,6,7,8,9};
		
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<aList.length;i++) {
			set.add(aList[i]);
		}
		
		for(int i=0;i<bList.length;i++) {
			if(set.contains(bList[i])) {
				System.out.println(bList[i]);
				return;
			}
		}
		System.out.println("No Intersection");

	}

}
