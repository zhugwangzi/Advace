package char11_class_property;

public class ClassTest extends G.B{
	public ClassTest(G a) {
		a.super();
		System.out.println("�̳��ڲ���");
	}
	public static void main(String[] args) {
		ClassTest classTest=new ClassTest(new G());
	}
}
class G{
	public G() {
		System.out.println("�ⲿ��");
	}
	class B{
		public B() {
			System.out.println("�ڲ���");
		}
	}
}