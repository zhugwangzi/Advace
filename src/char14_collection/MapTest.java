package char14_collection;
import java.util.*;
class Emp{
	private String id;
	private String name;
	public Emp(String id,String name) {//���췽����id,name��ֵ
		this.id=id;
		this.name=name;
	}
	public String getId() {//��ȡid
		return id;
	}
	public String getName() {//��ȡname
		return name;
	}
}
public class MapTest {
	public static void main(String[] args) {
		//ʵ����5��Emp��Ķ���
		Emp emp1=new Emp("001","С��");
		Emp emp2=new Emp("012","С��");
		Emp emp3=new Emp("025","С��");
		Emp emp4=new Emp("007","С��");
		Emp emp5=new Emp("011","С��");
		
		Map<String, String> map=new HashMap<>();//��HashMapʵ��map����
		map.put(emp1.getId(),emp1.getName());//���Ԫ�ص�map����
		map.put(emp2.getId(),emp2.getName());
		map.put(emp3.getId(),emp3.getName());
		map.put(emp4.getId(),emp4.getName());
		map.put(emp5.getId(),emp5.getName());
		Set<String> set=map.keySet();//ʵ����set����׼�����key����
		Iterator<String> it1=set.iterator();//������������ȡkey
		System.out.println("��HashMapʵ�ֵ�����Map����");
		while(it1.hasNext()) {
			String id=(String)it1.next();
			String name=(String)map.get(id);
			System.out.println(id+" "+name);
		}
		
		Map<String, String> treemap=new TreeMap<>();//��TreeMapʵ��treemap����
		treemap.putAll(map);//�������Ԫ�ص�treemap����
		Iterator<String> it2=treemap.keySet().iterator();//������������ȡkey��ɵļ���
		System.out.println("��TreeMapʵ�ֵ�����Map����");
		while(it2.hasNext()) {
			String id=(String)it2.next();
			String name=(String)map.get(id);
			System.out.println(id+" "+name);
		}
	}
}
