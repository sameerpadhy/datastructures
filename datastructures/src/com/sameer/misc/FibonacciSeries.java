package com.sameer.misc;

public class FibonacciSeries {
	
	public static int fib(int n) {
		if(n<0)throw new IllegalArgumentException("Invalid Number");
		else if(n==0)return 0;
		else if(n==1) return 1;
		else return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(3));

	}

}
