package char17_enum;
import java.util.*;
public class MultiOverClass<K,V>{
	Map<K,V> map=new HashMap<K,V>();
	public void multiPut(K k,V v) {//添加元素
		map.put(k,v);
	}
	public V multiGet(K k) {//获取key对应的值
		return map.get(k);
	}
	public static void main(String[] args) {
		MultiOverClass<Integer,String> m=new MultiOverClass<Integer,String>();
		m.multiPut(3,"学生3");
		m.multiPut(1,"学生1");
		m.multiPut(2,"学生2");
		m.multiPut(4,"学生4");
		//创建能放置所有key的Set集合，注意它是个空集
		Set<Integer> set=m.map.keySet();
		Iterator<Integer> it=set.iterator();//用迭代器把元素添加进去
		int i=0;
		while(it.hasNext()) {
			i++;
			Integer key=(Integer) it.next();
			System.out.println("第"+i+"个元素的key："+key);
			System.out.println("第"+i+"个 元素的值："+m.multiGet(key));
		}
	}
}