package char17_enum;
import java.util.*;
public class MultiOverClass<K,V>{
	Map<K,V> map=new HashMap<K,V>();
	public void multiPut(K k,V v) {//���Ԫ��
		map.put(k,v);
	}
	public V multiGet(K k) {//��ȡkey��Ӧ��ֵ
		return map.get(k);
	}
	public static void main(String[] args) {
		MultiOverClass<Integer,String> m=new MultiOverClass<Integer,String>();
		m.multiPut(3,"ѧ��3");
		m.multiPut(1,"ѧ��1");
		m.multiPut(2,"ѧ��2");
		m.multiPut(4,"ѧ��4");
		//�����ܷ�������key��Set���ϣ�ע�����Ǹ��ռ�
		Set<Integer> set=m.map.keySet();
		Iterator<Integer> it=set.iterator();//�õ�������Ԫ����ӽ�ȥ
		int i=0;
		while(it.hasNext()) {
			i++;
			Integer key=(Integer) it.next();
			System.out.println("��"+i+"��Ԫ�ص�key��"+key);
			System.out.println("��"+i+"�� Ԫ�ص�ֵ��"+m.multiGet(key));
		}
	}
}