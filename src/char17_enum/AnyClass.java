package char17_enum;
import java.util.*;
public class AnyClass {
	public static void main(String[] args) {
		System.out.println("ArrayList���Ϸ�����");
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			a.add(i);
		}
		System.out.print("[");
		for(int i=0;i<a.size();i++) {
			System.out.print(i==9?a.get(i)+"]\n":a.get(i)+",");
		}
		
		System.out.println("\nMap���Ϸ�����");
		Map<Integer,String> m=new HashMap<Integer,String>();
		for(int i=10;i<20;i++) {
			m.put(i,"ѧ��"+i);
		}
		for(int i=10;i<10+m.size();i++) {
			System.out.println("("+i+","+m.get(i)+")");
		}
		
		System.out.println("\nVector���Ϸ�����");
		Vector<String> v=new Vector<String>();
		for(int i=0;i<10;i++) {
			v.addElement("��Ա"+i);
		}
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
	}
}
