package char14_collection;
import java.util.*;
public class Test1 {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();//��Linkedlist����list����
		int i=10;
		while(i<20) {//���Ԫ��
			list.add(i);
			i++;
		}
		System.out.println("List�����е�Ԫ��Ϊ");
		for(i=0;i<10;i++) {
			System.out.print(list.get(i)+" ");
		}
		
		list.remove(4);
		Iterator<Integer> it=list.iterator();
		System.out.println("\n�Ƴ���Ԫ�غ�List�����е�Ԫ��Ϊ");
		while(it.hasNext()) {
			Integer s=(Integer)it.next();
			System.out.print(s+" ");
		}
	}
}
