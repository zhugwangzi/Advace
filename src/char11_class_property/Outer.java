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
		System.out.println("�ⲿ��Ĺ��췽��");
	}
	private class Inner{
		public Inner() {
			System.out.println("�ڲ���Ĺ��췽��");
		}
		public int i=1;
		public void doit() {
			System.out.println("�ڲ���ĳ�Ա����");
		}
	}
	public static void main(String[] args) {
		Outer o=new Outer();
		System.out.println(o.getI());
		o.getInnerMethod();
	}
}
