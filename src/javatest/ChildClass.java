package javatest;

public class ChildClass extends ParentClass{
	
	int a=20;// a variable is declared in parent and child class , but the child class value is overriding parent class variable value

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c=new ChildClass();
		c.A();
		c.B();
		c.C();
		System.out.println("value of a variable"+c.a);

	}

	// C method is declared in parent and child class , but the child class method is overriding parent class method
	public void C() {
		System.out.println("I am from Child C megthod");
	}
	
}
