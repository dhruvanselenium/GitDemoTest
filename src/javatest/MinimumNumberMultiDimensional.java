package javatest;

public class MinimumNumberMultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 1 45 23
		 * 26 18 34
		 * 52 50 95
		 */

		int a[][]= {{105,45,23},{26,18,34},{52,50,95}};
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print('\t');
				
			}
			System.out.println("");
		}
	}

}
