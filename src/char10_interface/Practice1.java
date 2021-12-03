package char10_interface;

public class Practice1 {
	private int variable;//定义成员变量
	public void setValue(int value) {//定义成员方法赋值
		this.variable=value;
	}
	public int getValue() {//定义成员方法
		this.setValue(5);
		System.out.println("变量值："+variable);
		return this.variable;
	}
	
	public static void main(String[] args) {
		Practice1 p=new Practice1();
		p.getValue();
	}
}
