package com.BasicPrograms.com;

public class SwitchCaseTwo {
	public static void main(String[] args) {
		String Car = "Swift";
		switch (Car) {
		case "Alto":
			System.out.println("The car is not Alto");
			break;
			
		case "Swift Dizire":
			System.out.println("The car is not Swift dizire");
			
		case "800":
			System.out.println("The car is not 800");
			
		
		case "Baleno":
			System.out.println("The car is Swift");
			
			default:
				System.out.println("The car is "+Car);
			
		}
	}

}
