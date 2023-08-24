package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hasset 
{
	public static void main(String[] args) {
		ArrayList<Integer> hs=new ArrayList();
		hs.add(123);
		hs.add(122);
		hs.add(321);
		hs.add(234);
		hs.add(122);
		for(int i:hs)
		{
			System.out.println(i);
		}
	}
}
