package com.controlstatements.com;

public class IfElseIF {
	public static void main(String []args) {
		char a = 2;
		byte b = 1;
		if (a-b>3) {
			System.out.println("The Subtracted value of ab is not greater than 3");
		}
		else if (a+b>30) {
			System.out.println("The added value of ab is not greater than 3");
		}
		else {
			System.out.println("The above two condition is not true so else block is printed");
		}
	}

}
