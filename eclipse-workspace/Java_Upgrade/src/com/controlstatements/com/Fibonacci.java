package com.controlstatements.com;

public class Fibonacci {
	public static void main(String args[]) {
		int a=0,b=1,c=10,i,e;
		System.out.print(a+" "+b);
		for (i=2;i<c;++i) {
			e = a+b;
			System.out.print(" "+i);
			a = b;
			b = e;
			
			
		}
		
	
	}
	

}
