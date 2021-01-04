package collections;

import java.util.ArrayList;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,5,4,5,9,5,6,3};
		ArrayList <Integer> al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			
			if(!al.contains(a[i]))
			{
				
				al.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
					
				}
				
				System.out.println("value of " +a[i]+"is repeated :"+k);
				if(k==1)
				{
					System.out.println("Unique value of " +a[i]+"is  :"+k);
				}
				
			}
			//System.out.println("value of " +a['i']+"is : "+  k);
				
		}

	}

}
