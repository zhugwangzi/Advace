package char10_interface;
public class Employee {
	private String name;//����
	private String address;//��ַ
	private int number;//����
	public Employee(String name,String address,int number) {
		System.out.println("����Employee���췽��");
		this.name=name;
		this.address=address;
		this.number=number;
	}
	//��Ա���������ӣ����Ҫ�ó�Ա������ȡ
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getNumber() {
		return number;
	}
	public void mailCheck() {
		System.out.println("mailCheck����");
		System.out.println("�ʼ�֧Ʊ");
	}
	public String toString() {
		return name+" "+address+" "+number;
	}
}
