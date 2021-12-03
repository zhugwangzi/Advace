package char11_class_property;

class Parents{
	private final void doIt() {
		System.out.println("���෽��doIt()");
	}
	final void doIt2() {
		System.out.println("���෽��doIt2()");
	}
	public void doIt3() {
		System.out.println("���෽��doIt3()");
	}
}

class SubClass extends Parents{
//		final int i=0;
//		i=9;�������ܸı�final����ֵ
	public final void doIt() {
		System.out.println("���෽��doIt()");
	}
//	final void doIt2() {
//		System.out.println("���෽��doIt2()");
//	}�������ܸ��Ǹ���final����
	public void doIt3() {
		System.out.println("���෽��doIt3()");
	}
}
public class FinalMethod {
	public static void main(String[] args) {
		SubClass s=new SubClass();
		s.doIt();
		s.doIt2();				//sҲ��Parents��Ķ��󣬿��Է��ʸ��෽��
		s.doIt3();
		System.out.println();
		
		Parents p=s;//����ת��
		//p.doIt();			//�����޷����ʸ���private���εķ���
		p.doIt2();
		p.doIt3();
	}
}
