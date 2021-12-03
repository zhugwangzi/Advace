package char10_interface;
interface draw{//定义接口
	public void test();//定义方法
}
class A extends D implements draw{//子类A
	public void test() {
		System.out.println(getClass().getName());
	}
}
class B extends D implements draw{//子类B
	public void test() {
		System.out.println("getClass().getName()");
	}
	public void doSomething() {//重写父类方法
		//语句
	}
}
class C extends D{//子类C
	public void test() {
		System.out.println("正方形");
	}
	public void doSomething() {
		//语句
	}
}
public class D{
	public void doSomething() {
		//语句
	}
	public static void main(String[] args) {
		draw[] m= {new A(),new B()};
		for(int i=0;i<m.length;i++) {
			m[i].test();
		}
	}
}
