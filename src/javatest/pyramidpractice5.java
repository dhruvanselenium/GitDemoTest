package javatest;

public class pyramidpractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 3
		 6 9
		 12 15 18
		 */
		int k=1;
		for(int i=1;i<4;i++)
			
		{
			
			System.out.println("");	
			
			for(int j=1;j<=i;j++)
			{
				
				System.out.print('\t');
				System.out.print(k*3);
				//k=k+j;
				k++;
			}
			
				
		}

	}

}
