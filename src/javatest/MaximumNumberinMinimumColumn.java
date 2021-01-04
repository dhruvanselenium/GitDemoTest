package javatest;

public class MaximumNumberinMinimumColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * FInd the maximum number in minimum number column
		 * 105 45 23
		 * 26 18 34
		 * 52 500 95
		 */

		int a[][]= {{105,45,23},{26,18,34},{52,500,95}};
		int min=a[0][0];
		int mincol=0;
		
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
			
				if(a[i][j]<min)
				{
					min=a[i][j];
					mincol=j;
				}
							
			}
			
		}
		
		System.out.println("Minimum number is : "+ min);
		
		
		int max=a[0][mincol];
		
		int k=0;
		while(k<a.length)
		{
			if(a[k][mincol]>max) 
			{
				max=a[k][mincol];
				
			}
			
			k++;
		}
		
		System.out.println("Maximum number is : "+ max);
	}

}
