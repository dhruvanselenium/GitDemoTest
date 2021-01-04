package javatest;

public class ThisDemo {

	 int a=3;//Global variable has scope for complete class
	
	public void getData()
	{
		int a=10;//local variable has scope within that method only
	System.out.println("value of a is :"+a);
	System.out.println(" value of a outside method is :"+this.a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo td=new ThisDemo();
		td.getData();
		//System.out.println("value of a outside method is :"+td.a);

	}

}
