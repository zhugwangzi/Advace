package char14_collection;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();//用Linkedlist创建list集合
		int i=10;
		while(i<20) {//添加元素
			list.add(i);
			i++;
		}
		System.out.println("List集合中的元素为");
		for(i=0;i<10;i++) {
			System.out.print(list.get(i)+" ");
		}
		
		list.remove(4);
		Iterator<Integer> it=list.iterator();
		System.out.println("\n移除该元素后List集合中的元素为");
		while(it.hasNext()) {
			Integer s=(Integer)it.next();
			System.out.print(s+" ");
		}
	}
}
