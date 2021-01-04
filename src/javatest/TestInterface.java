package javatest;

public class TestInterface implements InterfaceTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInterface t=new TestInterface();
		t.openaccount();
		t.issuecard();
	    System.out.println("Interface variable value is : "+t.a);
	    t.closeaccount();
		//InterfaceTest it=new InterfaceTest();

	}

	@Override
	public void issuecard() {
		System.out.println("I am from Interface issue card");
		
	}

	@Override
	public void openaccount() {
		// TODO Auto-generated method stub
		
		System.out.println("I am from Open account ");
		
	}

	@Override
	public void closeaccount() {
		// TODO Auto-generated method stub
		
		System.out.println("I am from Close account");
		
	}

}
