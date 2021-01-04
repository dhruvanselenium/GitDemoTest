package javatest;

public class pyramidpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1
		 2 3
		 4 5 6
		 7 8 9 10
		 
		 
		 */
		int k=1;
		for(int i=0;i<4;i++)
		{
			System.out.println("");	
			
			for(int j=1;j<=4-i;j++)
			{
				System.out.print('\t');
				System.out.print(k);
				k++;
			}
			
				
		}

	}

}
