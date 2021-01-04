package javatest;

public class FinalDemo extends FinalDemo2{
	
	final static int i=10;
	
	FinalDemo()
	{
		System.out.println("i value in Parent class"+super.i);
		
	}
	
	final void getdata()
	{
		System.out.println("I am from child method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalDemo fd=new FinalDemo();
		System.out.println(" i value is :"+i);
		fd.getdata();
		
	}

}
