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
	//����һ���ڲ���ʵ��InnerClassInterface�ӿ�
	private class C implements InnerClassInterface{
		public C(String s) {
			System.out.println(s);
		}
		public void f(){
			System.out.println("�����ڲ����f()����");
		}
	}
	public InnerClassInterface doit() {
		/*��ʵ����C����󣬷���ֵ����Ϊ�ӿ����ͣ�
		 * ����Ϊ�ַ���,ͬʱ�����Զ�����C��Ĺ��췽��
		 */
		return new C("�ڲ���Ĺ��췽��");
	}
}
