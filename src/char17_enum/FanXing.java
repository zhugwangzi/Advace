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
		f.myPut(2,"��Ա2");
		f.myPut(1,"��Ա1");
		f.myPut(3,"��Ա3");
		f.myPut(5,"��Ա5");
		//������������Integer���Ͳ�����ȫ��Ԫ����ӵ�it����
		Iterator<Integer> it=f.mySet().iterator();
		while(it.hasNext()) {
			Integer key=(Integer)it.next();
			System.out.print("����"+key);
			System.out.println(" ��ֵ��"+f.myGet(key));
		}
	}
}
