package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h=new HashSet<String>();
		h.add("USA");
		h.add("UK");
		h.add("India");
		h.add("Australia");
		h.add("India");
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.contains("India"));
		h.remove("UK");
		System.out.println(h);
		h.add("Germany");
		Iterator<String> itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
