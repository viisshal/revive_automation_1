package com.abstraction.com;

abstract class Abmthods {
	abstract void ab();

}
class abs extends Abmthods{
	@Override
	void ab() {
		System.out.println("Hello guys");
	}

}
public class Abmethods{
	public static void main(String args[]) {
		//Abmthods bs = new Abmthods(); (Cannot instantiate the Abmthods because it is an abstract class)
		//bs.ab();
		
		abs bsa = new abs();
		bsa.ab();	
		
	}
}
