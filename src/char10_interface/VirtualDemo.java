package char10_interface;
public class VirtualDemo {
	public static void main(String[] args) {
		Salary s=new Salary("Ա��A","����",003,10000);
		System.out.println("ʹ��Salary�����õ���mailCheck����");
		s.mailCheck();
		
		System.out.println();
		Employee e=new Salary("Ա��B","�Ϻ�",012,11000);
		System.out.println("ʹ��Employee�����õ���mailCheck����");
		
		e.mailCheck();//������s����e�����õĶ�����д���mailCheck����
	}
}
