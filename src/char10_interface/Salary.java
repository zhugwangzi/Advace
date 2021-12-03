package char10_interface;
public class Salary extends Employee{
	private double salary;//工资
	public Salary(String name,String address,int number,double salary) {
		super(name,address,number);
		System.out.println("子类Salary构造方法");
		setSalary(salary);
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {//成员变量不可视，要用成员方法获取
		return salary;
	}
	public void mailCheck() {
		System.out.println("重写mailCheck方法");
		System.out.println("邮寄支票给："+getName()+"\n工资："+
				getSalary()+"元\n地址："+getAddress());
	}
}
