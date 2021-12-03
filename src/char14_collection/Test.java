package char14_collection;
public class Test {
	public static int staticVar=0;//类变量，也称为静态变量
	public int instanceVar=0;//成员变量，也称为实例变量
	//变量递增,打印变量值
	public void printVar() {
		staticVar++;
		instanceVar++;
		System.out.println("staticVar="+staticVar+" instanceVar="+instanceVar);
	}
	
	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			Test t=new Test();
			t.printVar();
		}
	}
}
