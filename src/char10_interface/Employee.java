package char10_interface;
public class Employee {
	private String name;//姓名
	private String address;//地址
	private int number;//工号
	public Employee(String name,String address,int number) {
		System.out.println("父类Employee构造方法");
		this.name=name;
		this.address=address;
		this.number=number;
	}
	//成员变量不可视，因此要用成员方法获取
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
		System.out.println("mailCheck方法");
		System.out.println("邮寄支票");
	}
	public String toString() {
		return name+" "+address+" "+number;
	}
}
