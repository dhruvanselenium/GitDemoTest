package javatest;

public class PublicPrivateProtectedDemo {

	
	int a=10;
	public int b=20;
	private int c=30;
	protected int d=40;
	
	//Default : All methods and variables which are default can be accessed within package only
	//Public : All methods and variables can be accessed across all the packages
	//Private : Methods and variables can be accessed within the class only and it can't be accessed outside the class
	//Protected :All methods and variables which are protected can be accessed outside the package when the child class extends Parent class
	
	void DefaultMethod() 
	{
		System.out.println("I am from default access Modifier");
	}
	public void PublicMethod() 
	{
		System.out.println("I am from Public access Modifier");
	}
	private void PrivateMethod() 
	{
		System.out.println("I am from Private access Modifier");
	}
	protected void ProtectedMethod() 
	{
		System.out.println("I am from Protected access Modifier");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
