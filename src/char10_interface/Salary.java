package char10_interface;
public class Salary extends Employee{
	private double salary;//����
	public Salary(String name,String address,int number,double salary) {
		super(name,address,number);
		System.out.println("����Salary���췽��");
		setSalary(salary);
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {//��Ա���������ӣ�Ҫ�ó�Ա������ȡ
		return salary;
	}
	public void mailCheck() {
		System.out.println("��дmailCheck����");
		System.out.println("�ʼ�֧Ʊ����"+getName()+"\n���ʣ�"+
				getSalary()+"Ԫ\n��ַ��"+getAddress());
	}
}
