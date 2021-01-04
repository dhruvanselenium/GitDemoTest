package javatest;

public class ChildSuperDemo extends ParentSuperDemo{

	
	String name="Pavan";
	
	ChildSuperDemo()
	{
		super();//this will invoke the Parent class constructor and this method should be 1st line
		System.out.println("I am from child class constructor");
	}
	public void getData() 
	{
		System.out.println("I am from child method :"+name);
		System.out.println("I am from Parent class :"+super.name);
		super.getData();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChildSuperDemo csd=new ChildSuperDemo();
		csd.getData();
	}

}
