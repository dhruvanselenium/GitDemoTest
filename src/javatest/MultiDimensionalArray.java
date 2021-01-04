package javatest;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 105 45 23
		 * 26 18 34
		 * 52 500 95
		 */

		int a[][]= {{105,45,23},{26,18,34},{52,500,95}};
		int min=a[0][0];
		int max=a[0][0];
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
			
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
				
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				
			}
			
		}
		
		System.out.println("Minimum number is : "+ min);
		System.out.println("Maximum number is : "+ max);
	}

}
