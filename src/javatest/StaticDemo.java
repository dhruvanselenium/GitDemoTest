package javatest;

public class StaticDemo {

	static String City="Bangalore";//Instance/class variables
	String Address;
	String name;
	
	StaticDemo()
	{
		System.out.println("I am from Default constructor");
	}
   StaticDemo(String name,String Address){
	
	System.out.println("I am from Parametrised constructor");
	this.name=name;
	this.Address=Address;
		
	}
   
   public static void getDisplay() 
   {
	   System.out.println("city name is : "+City);
	   	   
   }
   
   public void printdetails()
   {
	   System.out.println(" name is : "+name);
	   System.out.println(" address is : "+Address);
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticDemo sd=new StaticDemo("Dhruvan","Yeshwanthpur");
		StaticDemo sd1=new StaticDemo("Aarush","Bangalore");
		sd.printdetails();
		sd1.printdetails();
		getDisplay();
		
		
	}

}
