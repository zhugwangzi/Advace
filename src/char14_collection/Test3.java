package char14_collection;
import java.util.*;
class Employee{
	int id;
	String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
}
public class Test3 {
	public static void main(String[] args) {
		Employee emp1=new Employee(001,"Ա��1");
		Employee emp4=new Employee(004,"Ա��4");
		Employee emp3=new Employee(003,"Ա��3");
		Employee emp2=new Employee(002,"Ա��2");
		Employee emp5=new Employee(005,"Ա��5");
		Employee emp7=new Employee(007,"Ա��7");
		Employee emp6=new Employee(006,"Ա��6");
		
		Map<Integer,String> map=new HashMap<>();
		map.put(emp1.id,emp1.name);
		map.put(emp4.id,emp4.name);
		map.put(emp3.id,emp3.name);
		map.put(emp2.id,emp2.name);
		map.put(emp5.id,emp5.name);
		map.put(emp7.id,emp7.name);
		map.put(emp6.id,emp6.name);
		Set<Integer> set=map.keySet();
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			Integer in=(Integer) it.next();
			System.out.println(in+","+map.get(in));
		}
		
		map.remove(3);
		it=map.keySet().iterator();
		System.out.println();
		while(it.hasNext()) {
			Integer in=(Integer) it.next();
			System.out.println(in+","+map.get(in));
		}
		
	}
}
