package com.variables.com;

public class StaticVariables {
	static int d = 2;
	public static void main(String args[]) {
		int a = 2;
		int b = 2;
		int c = a * b ;
		System.out.println("The value of c is "+c);
		StaticVariables.vishal();
		int d = a;
		System.out.println("The value of d is "+d);
		
		
		
	}
static void vishal() {
	int a = 3 ;
	int b = 2;
	int c = a + b;
	System.out.println("The value of method c is "+c);
}
}
