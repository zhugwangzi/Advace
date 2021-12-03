package char11_class_property;

class Parents{
	private final void doIt() {
		System.out.println("父类方法doIt()");
	}
	final void doIt2() {
		System.out.println("父类方法doIt2()");
	}
	public void doIt3() {
		System.out.println("父类方法doIt3()");
	}
}

class SubClass extends Parents{
//		final int i=0;
//		i=9;报错，不能改变final变量值
	public final void doIt() {
		System.out.println("子类方法doIt()");
	}
//	final void doIt2() {
//		System.out.println("子类方法doIt2()");
//	}报错，不能覆盖父类final方法
	public void doIt3() {
		System.out.println("子类方法doIt3()");
	}
}
public class FinalMethod {
	public static void main(String[] args) {
		SubClass s=new SubClass();
		s.doIt();
		s.doIt2();				//s也是Parents类的对象，可以访问父类方法
		s.doIt3();
		System.out.println();
		
		Parents p=s;//向上转型
		//p.doIt();			//报错，无法访问父类private修饰的方法
		p.doIt2();
		p.doIt3();
	}
}
