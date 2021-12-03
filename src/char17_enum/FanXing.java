package char17_enum;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FanXing<K,V> {
	Map<K, V> map=new HashMap<K,V>();
	public void myPut(K k,V v) {
		map.put(k,v);
	}
	public V myGet(K k) {
		return map.get(k);
	}
	public Set mySet(){
		return map.keySet(); 
	}
	public static void main(String[] args) {
		FanXing<Integer, String> f=new FanXing<Integer,String>();
		f.myPut(2,"成员2");
		f.myPut(1,"成员1");
		f.myPut(3,"成员3");
		f.myPut(5,"成员5");
		//创建迭代器把Integer类型参数的全部元素添加到it里面
		Iterator<Integer> it=f.mySet().iterator();
		while(it.hasNext()) {
			Integer key=(Integer)it.next();
			System.out.print("键："+key);
			System.out.println(" ，值："+f.myGet(key));
		}
	}
}
