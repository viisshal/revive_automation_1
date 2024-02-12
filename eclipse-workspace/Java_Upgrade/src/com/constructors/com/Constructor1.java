package com.constructors.com;

class Constructor123 {
	
	String s;
	int a;
	Constructor123(String s,int a){
		this.s = s;
		this.a = a;
		
	}
	

}
public class Constructor1 {
	public static void main(String args[]) {
		Constructor123 ct123= new Constructor123("Vishal",57);
		System.out.println("The student name and Id is "+ct123.s +" and "+ct123.a);
		
	}
}
