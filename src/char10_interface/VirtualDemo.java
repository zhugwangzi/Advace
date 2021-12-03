package char10_interface;
public class VirtualDemo {
	public static void main(String[] args) {
		Salary s=new Salary("员工A","北京",003,10000);
		System.out.println("使用Salary的引用调用mailCheck方法");
		s.mailCheck();
		
		System.out.println();
		Employee e=new Salary("员工B","上海",012,11000);
		System.out.println("使用Employee的引用调用mailCheck方法");
		
		e.mailCheck();//无论用s还是e，调用的都是重写后的mailCheck方法
	}
}
