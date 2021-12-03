package char11_class_property;
interface InnerClassInterface{
	public void f();
}
public class M{
	public static void main(String[] args) {
		B b=new B();
		InnerClassInterface in=b.doit();
		in.f();
	}
}
class B{
	//定义一个内部类实现InnerClassInterface接口
	private class C implements InnerClassInterface{
		public C(String s) {
			System.out.println(s);
		}
		public void f(){
			System.out.println("访问内部类的f()方法");
		}
	}
	public InnerClassInterface doit() {
		/*先实例化C类对象，返回值类型为接口类型，
		 * 内容为字符串,同时还会自动调用C类的构造方法
		 */
		return new C("内部类的构造方法");
	}
}
