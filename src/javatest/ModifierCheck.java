package javatest;

public class ModifierCheck {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PublicPrivateProtectedDemo ppd=new PublicPrivateProtectedDemo();
	System.out.println("value of a : "+ppd.a);
	System.out.println("value of b : "+ppd.b);
	//System.out.println("value of c : "+ppd.c); -> giving error as the variable is private
	System.out.println("value of d : "+ppd.d);
	
	ppd.DefaultMethod();
	ppd.PublicMethod();
	ppd.ProtectedMethod();
	//Private method is not accessible as the method is declared as private

	}

}
