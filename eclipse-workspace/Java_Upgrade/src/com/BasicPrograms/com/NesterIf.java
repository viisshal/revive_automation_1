package com.BasicPrograms.com;

public class NesterIf {
	public static void  main(String[] args) {
		int x = 2;
		int y = 3;
		int z = 4;
		
		if(x == 1) {
			if (x == 9) {
				System.out.println("The value of x is not 9");
			}
			else if(y == 3) {
				System.out.println("The value of y is 3");
			}
			else {
				System.out.println("The value of x and y is 2 and 3");
			}
		
		}
		else {
			System.out.println("The value of xyz are 2,3,4");
		}
	}

}
