package char11_class_property;

public class Test{
	//���ⲿ����ʵ����һ���ڲ������in
	InnerClass in=new InnerClass();
	public Test() {//�ⲿ��Ĺ��췽��
		in.doin();//��in�����ڲ��෽��
	}
	public InnerClass dout2() {
		in.i=1;//��in�����ڲ���Ա����i
		System.out.println(in.i);
		return new InnerClass();//����ֵ����ΪInnerClass����
	}
	
	class InnerClass{//��Ա�ڲ���
		public InnerClass() {
			System.out.println("�ڲ��๹�췽��");
		}
		public void doin() {
			System.out.println("�ڲ���ĳ�Ա����");
		}
		int i=0;
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		System.out.println();
		//���ⲿ��ķǾ�̬����dout2()ʵ�����ڲ���Ķ���
		Test.InnerClass in=t.dout2();
		System.out.println();
		Test.InnerClass in2=t.new InnerClass();
	}
}