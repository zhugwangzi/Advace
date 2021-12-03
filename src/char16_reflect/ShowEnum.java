package char16_reflect;
public class ShowEnum {
	enum Constants{//把常量放在枚举类型中
		CONSTANT_A,CONSTANT_B
	}
	public static void compare(Constants x) {
		System.out.println(x+"与CONSATNT_A的比较结果："
				+x.compareTo(Constants.CONSTANT_A));
	}
	public static void main(String[] args) {
		Constants[] c=Constants.values();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
			compare(c[i]);
		}
		compare(Constants.valueOf("CONSTANT_A"));
		System.out.println("CONSTANT_A的位置："+Constants.CONSTANT_A.ordinal());
		System.out.println("CONSTANT_B的位置："+Constants.CONSTANT_B.ordinal());
	}
}
