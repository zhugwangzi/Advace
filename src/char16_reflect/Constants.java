package char16_reflect;
interface ConstantsInterface{
	public static final int CONSTANT_A=1; 
	public static final int CONSTANT_B=2; 
}
public class Constants {
	enum Constants2{
		CONSTANT_A,
		CONSTANT_B
	}
	public static void doit(int i) {
		switch(i) {
			case ConstantsInterface.CONSTANT_A:
				System.out.println("用doit()方法输出:"+ConstantsInterface.CONSTANT_A );
				break;
			case ConstantsInterface.CONSTANT_B:
				System.out.println("用doit()方法输出:"+ConstantsInterface.CONSTANT_B);
				break;
		}
	}
	public static void doit2(Constants2 c) {
		switch(c) {
		case CONSTANT_A:
			System.out.println("用doit2()方法输出:"+Constants2.CONSTANT_A);
			break;
		case CONSTANT_B:
			System.out.println("用doit2()方法输出:"+Constants2.CONSTANT_B);
			break;
		}
	}
	public static void main(String[] args) {
		Constants.doit(1);
		System.out.println(ConstantsInterface.CONSTANT_A);
		System.out.println(Constants2.CONSTANT_A);//不能直接用CONSTANT_A
		
		Constants.doit(ConstantsInterface.CONSTANT_A);
		Constants.doit(ConstantsInterface.CONSTANT_B);
		Constants.doit2(Constants2.CONSTANT_A);
		Constants.doit2(Constants2.CONSTANT_B);
	}
}
