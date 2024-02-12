package com.skills.com;

public class One {
	public static void main(String[] args) {
		int x = 0,y = 1, z;
		System.out.print(x +" " +y);
		for(int a = 2;a<10;++a) {
			z=x + y;
			System.out.print(" "+z);
			x = y;
			y = a;	
			
		}
		
		
	}

}
