package javatest;

public class SingledimensionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[4];
		a[0]=10;
		a[1]=4;
		a[2]=6;
		a[3]=8;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int b[]= {10,25,156,48};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println("b values are:"+b[i]);
		}
		
	}

}
