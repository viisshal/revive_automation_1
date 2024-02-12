package com.BasicPrograms.com;

public class ForLoop {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int i,n,c;
		
		System.out.print(a);
		System.out.print(" "+b);
		
		for (i=2;i<10;i++) {
		n = a + b;
		System.out.print(" "+n);
		a=b;
		b=n;
		}
			
		
	}}

