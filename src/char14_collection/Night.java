package char14_collection;
import java.util.*;
public class Night{
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("df");
		list.add("df f!");
		list.add("dfu&");
		list.add("34");
		list.add("ty45");
		int i=(int) (Math.random()*(list.size()));
		System.out.println("�����ȡԪ�أ�"+list.get(i));
		list.remove(i);
		System.out.print("�Ƴ���Ԫ�غ����飺");
		for(String x:list) {
			System.out.print(x+" ");
		}
		System.out.println();
		list.set(i,"1");
		System.out.print("�޸�ԭ���±��Ԫ��Ϊ1������Ϊ");
		for(String x:list) {
			System.out.print(x+" ");
		}
	}
}
