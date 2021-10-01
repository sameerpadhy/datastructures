package com.sameer.anagram;

import java.util.Arrays;

public class IsAnagram {
	
	private static boolean isAnagram(String s1, String s2) {
		if(s1.length()!=s2.length() )
		return false;
		
		char c1[]=s1.toLowerCase().toCharArray();
		char c2[]=s2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String s3=new String(c1);
		System.out.println(s3);
		String s4=new String(c2);
		System.out.println(s4);
		if(s3.equalsIgnoreCase(s4)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="VEER";
		String s2="EVER";
		System.out.println(isAnagram(s1, s2));

	}

}
