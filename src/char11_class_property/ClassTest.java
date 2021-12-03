package char11_class_property;

public class ClassTest extends G.B{
	public ClassTest(G a) {
		a.super();
		System.out.println("继承内部类");
	}
	public static void main(String[] args) {
		ClassTest classTest=new ClassTest(new G());
	}
}
class G{
	public G() {
		System.out.println("外部类");
	}
	class B{
		public B() {
			System.out.println("内部类");
		}
	}
}