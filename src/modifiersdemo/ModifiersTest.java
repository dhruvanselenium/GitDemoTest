package modifiersdemo;

import javatest.PublicPrivateProtectedDemo;

public class ModifiersTest extends PublicPrivateProtectedDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ModifiersTest m=new ModifiersTest();
		//System.out.println("value of a : "+ppd.a); can't be accessible due to variable a is default
	System.out.println("value of b : "+m.b);
	//System.out.println("value of d :"+ppd.d);//can't be accessible as the d variable is protected and the child class is not extending Parent class	
	
	System.out.println("value of d :"+m.d);
	
	m.ProtectedMethod();
	m.PublicMethod();
	}

}
