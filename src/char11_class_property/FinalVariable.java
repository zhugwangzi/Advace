package char11_class_property;
import java.util.Random;
class A{
	public A(){
		System.out.println("���๹�췽��");
	}
	public void printOut() {
		System.out.println("���෽��");
	}
}
public class FinalVariable extends A{
	Random rand=new Random();//ʵ����һ��Random�����
	private final int i1=rand.nextInt(20);
	private final int i2=rand.nextInt(20);
	public String toString() {//����Object���toString()����
		return i1+" "+i2;
	}
	
	public FinalVariable() {
		System.out.println("���๹�췽��");
	}
	public void printOut() {
		System.out.println("���෽��");//��д���෽��
	}
	
	public static void main(String[] args) {
		FinalVariable f=new FinalVariable();//ʵ����һ��FinalVariable����,
			//���һ��Զ��Ⱥ���ø��������Ĺ��췽��
		System.out.println("\n"+f.toString()+"\n");
		f.printOut();
		System.out.println("\n"+f+"\n");//���Զ����ñ���д��toString()����
		System.out.println(new FinalVariable());//�����˸��ࡢ����Ĺ��췽����toString����

	}
}
