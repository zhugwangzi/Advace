package char10_interface;
interface draw{//����ӿ�
	public void test();//���巽��
}
class A extends D implements draw{//����A
	public void test() {
		System.out.println(getClass().getName());
	}
}
class B extends D implements draw{//����B
	public void test() {
		System.out.println("getClass().getName()");
	}
	public void doSomething() {//��д���෽��
		//���
	}
}
class C extends D{//����C
	public void test() {
		System.out.println("������");
	}
	public void doSomething() {
		//���
	}
}
public class D{
	public void doSomething() {
		//���
	}
	public static void main(String[] args) {
		draw[] m= {new A(),new B()};
		for(int i=0;i<m.length;i++) {
			m[i].test();
		}
	}
}
