package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List will allow you to add duplicate values
		//it will add the values in sequential order
		//values will be retrieved using index
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Pavan");
		a.add("Rahul");
		a.add("Aarush");
		a.add("Aarush");
		System.out.println(a);
		a.add(1, "Dhruvan");
		System.out.println(a);
		System.out.println(a.get(2));
		a.remove(0);
		System.out.println(a);
		System.out.println(a.contains("Prathyusha"));
		System.out.println(a.contains("AArush"));
		System.out.println(a.contains("Aarush"));
		System.out.println(a.indexOf("Rahul"));
		System.out.println(a.indexOf("Dhruvan"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		

	}

}
