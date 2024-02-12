package com.BasicPrograms.com;

public class ForLoopTwo {
	public static void main(String args[]) {
		int i,j;
		for (i=1;i<=6;i++) {
			for (j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}