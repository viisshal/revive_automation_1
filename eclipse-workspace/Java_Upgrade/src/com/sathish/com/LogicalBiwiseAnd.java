package com.sathish.com;

public class LogicalBiwiseAnd {
	public static void main(String args[]) {
		int a = 5 ;
		int b = 8 ;
		if(a<b&&b>a) {
			if (a<b&b<a) {
				System.out.println("The value of a is less than b");
			}
			else {
				System.out.println("The if exp is wrong");
			}
			
			System.out.println(a<b&&b>a);
			System.out.println(b<a&a<b);
			System.out.println(a<b||b<a++);
			System.out.println("The value of b is "+a);
		}
		
	}

}
