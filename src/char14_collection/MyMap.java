package char14_collection;
import java.util.*;

public class MyMap {
	public static void main(String[] args) {
		//ʵ����Map�Ķ���map
		Map<String,String> map=new HashMap<>();
		//���Ԫ��
		map.put("04","��ͬѧ");
		map.put("02","��ͬѧ");
		map.put("03","��ͬѧ");
		Set<String> set=map.keySet();//Map����������key���󹹳ɵ�set����
		Iterator<String> it=set.iterator();//��set�������Ԫ�صõ�it������
		System.out.println("key��ɵ�set���ϣ�");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		//Map����������value���󹹳ɵ�collection����
		Collection<String> col=map.values();
		it=col.iterator();//��ֵ��it������
		System.out.println("\n\nvalue������ɵ�collection���ϣ�");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
