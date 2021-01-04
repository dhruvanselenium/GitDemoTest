package javatest;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("Pavan");
		String rev =new String();
		for(int i=str.length()-1;i>=0;i--)
		{
		rev+=str.charAt(i);
		}
       System.out.println(rev);
	}

}
