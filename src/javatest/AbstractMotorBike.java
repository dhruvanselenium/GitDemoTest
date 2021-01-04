package javatest;

public class AbstractMotorBike extends AbstractTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractMotorBike am=new AbstractMotorBike();
		am.Engine();
		am.Break();
		am.vendor();
		am.Engine();
		System.out.println("value of the variable in abstract class : " + am.a);
 am.a=20;
 System.out.println("value of the variable in Main method : " + am.a);
	}

	@Override
	public void vendor() {
		// TODO Auto-generated method stub
		
		System.out.println("Our vendor is Hero");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Colour is red");
		
	}

}
