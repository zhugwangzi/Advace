package char14_collection;
import java.util.*;

public class MyMap {
	public static void main(String[] args) {
		//实例化Map的对象map
		Map<String,String> map=new HashMap<>();
		//添加元素
		map.put("04","李同学");
		map.put("02","赵同学");
		map.put("03","王同学");
		Set<String> set=map.keySet();//Map集合中所有key对象构成的set集合
		Iterator<String> it=set.iterator();//给set集合添加元素得到it迭代器
		System.out.println("key组成的set集合：");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		//Map集合中所有value对象构成的collection集合
		Collection<String> col=map.values();
		it=col.iterator();//赋值给it迭代器
		System.out.println("\n\nvalue对象组成的collection集合：");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
