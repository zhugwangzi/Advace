package char14_collection;
import java.util.*;
class Emp{
	private String id;
	private String name;
	public Emp(String id,String name) {//构造方法给id,name赋值
		this.id=id;
		this.name=name;
	}
	public String getId() {//获取id
		return id;
	}
	public String getName() {//获取name
		return name;
	}
}
public class MapTest {
	public static void main(String[] args) {
		//实例化5个Emp类的对象
		Emp emp1=new Emp("001","小明");
		Emp emp2=new Emp("012","小红");
		Emp emp3=new Emp("025","小章");
		Emp emp4=new Emp("007","小王");
		Emp emp5=new Emp("011","小李");
		
		Map<String, String> map=new HashMap<>();//用HashMap实现map对象
		map.put(emp1.getId(),emp1.getName());//添加元素到map集合
		map.put(emp2.getId(),emp2.getName());
		map.put(emp3.getId(),emp3.getName());
		map.put(emp4.getId(),emp4.getName());
		map.put(emp5.getId(),emp5.getName());
		Set<String> set=map.keySet();//实例化set对象，准备添加key集合
		Iterator<String> it1=set.iterator();//创建迭代器获取key
		System.out.println("由HashMap实现的无序Map集合");
		while(it1.hasNext()) {
			String id=(String)it1.next();
			String name=(String)map.get(id);
			System.out.println(id+" "+name);
		}
		
		Map<String, String> treemap=new TreeMap<>();//用TreeMap实现treemap对象
		treemap.putAll(map);//添加所有元素到treemap集合
		Iterator<String> it2=treemap.keySet().iterator();//创建迭代器获取key组成的集合
		System.out.println("由TreeMap实现的有序Map集合");
		while(it2.hasNext()) {
			String id=(String)it2.next();
			String name=(String)map.get(id);
			System.out.println(id+" "+name);
		}
	}
}
