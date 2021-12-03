package char14_collection;

import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("A");
		set.add("a");
		set.add("c");
		set.add("C");
		set.add("a");
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			String s=(String) it.next();
			System.out.print(s+" ");
		}
		System.out.println();
		List<String> list=new LinkedList<>();
		list.add("A");
		list.add("a");
		list.add("c");
		list.add("C");
		list.add("a");
		it=list.iterator();
		while(it.hasNext()) {
			String s=(String) it.next();
			System.out.print(s+" ");
		}
	}
}
