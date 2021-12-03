package char11_class_property;

public class Test{
	//在外部类中实例化一个内部类对象in
	InnerClass in=new InnerClass();
	public Test() {//外部类的构造方法
		in.doin();//用in访问内部类方法
	}
	public InnerClass dout2() {
		in.i=1;//用in访问内部成员变量i
		System.out.println(in.i);
		return new InnerClass();//返回值类型为InnerClass类型
	}
	
	class InnerClass{//成员内部类
		public InnerClass() {
			System.out.println("内部类构造方法");
		}
		public void doin() {
			System.out.println("内部类的成员方法");
		}
		int i=0;
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println();
		//用外部类的非静态方法dout2()实例化内部类的对象
		Test.InnerClass in=t.dout2();
		System.out.println();
		Test.InnerClass in2=t.new InnerClass();
	}
}