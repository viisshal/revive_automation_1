package com.variables.com;

public class InstanceVariable {
	public static void vishal() {
		int a = 2;
		float b = 3;
		float c = a * b;
		System.out.println("The value of c is "+c);
		int d =(int) c;
		System.out.println("The value of d is "+d);
		}
	public static int Army(int a,int b) {
	if(a>b)
		return a;
	return b;
		
	}
	public static void main(String []args) {
		InstanceVariable.vishal();
		int ans = Army(4,3);
		System.out.println(ans);
		
	}

}
