package com.abstraction.com;

abstract class starctionMethods {
	
	abstract void plane();
	
	void Jeep() {
		System.out.println("Jeep riding");
		
	}
}
class Planet extends starctionMethods{
	@Override
	void plane() {
		System.out.println("Riding a Plane");
	}
}
	public class AbstarctionMethods {
		public static void main(String args[]) {
			
			Planet pt = new Planet();
			pt.plane();
			pt.Jeep();
		}
	}

	
	
	

