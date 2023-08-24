package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class hashmap 
{
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm=new LinkedHashMap();
		hm.put(111, "good");
		hm.put(112, "bad");
		hm.put(113, "happy");
		hm.put(114, "sad");
		Set<Integer> allkeys=hm.keySet();
		for(Integer i:allkeys)
		{
			System.out.println(i+" "+hm.get(i));
		/////	System.out.println();
		}
	}
}
