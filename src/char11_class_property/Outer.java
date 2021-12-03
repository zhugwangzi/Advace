package char11_class_property;
public class Outer {
	Inner in=new Inner();
	public int getI() {
		return in.i*10;
	}
	public void getInnerMethod() {
		in.doit();
	}
	public Outer() {
		System.out.println("外部类的构造方法");
	}
	private class Inner{
		public Inner() {
			System.out.println("内部类的构造方法");
		}
		public int i=1;
		public void doit() {
			System.out.println("内部类的成员方法");
		}
	}
	public static void main(String[] args) {
		Outer o=new Outer();
		System.out.println(o.getI());
		o.getInnerMethod();
	}
}
