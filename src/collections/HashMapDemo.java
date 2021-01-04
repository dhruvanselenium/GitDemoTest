package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0,"Pavan");
		hm.put(1,"Ravan");
		hm.put(2,"Kavan");
		hm.put(3,"Savan");
		hm.put(5,"kavan");
		hm.put(10,"Mavan");
		
		System.out.println(hm);
		System.out.println(hm.get(11));
		System.out.println(hm.get(10));
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
		Map.Entry m=(Map.Entry)itr.next();
		System.out.println(m.getKey());
		System.out.println(m.getValue());
		}

	}

}
