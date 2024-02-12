package com.constructors.com;


class consoverload{
	String s;
	int i;
	long l;
	byte b;
	
	consoverload (String s,int i){
		this.s = s;
		this.i = i;
	}
	consoverload (byte b){
		//this.l = l;
		this.b = b;
	}
	
}

public class ConstructorOverloading {
	public static void main(String args[]) {
		consoverload ct = new consoverload("Vishal",1502257);
		System.out.println("The result is "+ct.s +" and "+ ct.i);
		consoverload ct2 = new consoverload(12);
		System.out.println("The result is " +ct2.b);
	}

}
