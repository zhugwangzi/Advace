package char17_enum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LimitClass{
	public static void main(String[] args) {
		List<String> l1=new  ArrayList<String>();
		List<?> l2=l1;
		List<?> l3=new LinkedList<Integer>();
		l1.add("��Ա1");
		l1.add("��Ա2");
		l1.add("��Ա3");
		System.out.println("ʹ��forѭ�����l1��Ԫ�أ�");
		for(int i=0;i<l1.size();i++){
			System.out.print(l1.get(i)+" ");
		}
		System.out.println("ʹ�õ��������l2��Ԫ�أ�");
		Iterator<?> it=l2.iterator();
		while(it.hasNext()) {
			System.out.print((String)it.next()+" ");
		}
		
		System.out.println("�޸�Ԫ�أ�");
		l1.set(0,"�ı��Ա1");
		System.out.println(l1.get(0));
		l2.remove(1);
		System.out.println(l2.get(1));
		
	}

}
