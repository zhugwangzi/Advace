package char17_enum;
public class Test1 {
	enum EnumClass{
		CONSTANTS_A("成员1"),
		CONSTANTS_B("成员2"),
		CONSTANTS_C("成员3"),
		CONSTANTS_D(2);
		private EnumClass(String s) {
		}
		private EnumClass(int i) {
		}
	}
	public static void enumConstants(EnumClass e) {
		switch (e){
			case CONSTANTS_A:
				System.out.println(EnumClass.CONSTANTS_A);
				break;
			case CONSTANTS_B:
				System.out.println(EnumClass.CONSTANTS_B);
				break;
			case CONSTANTS_C:
				System.out.println(EnumClass.CONSTANTS_C);
				break;
			case CONSTANTS_D:
				System.out.println(EnumClass.CONSTANTS_D);
				break;
			default:
				System.out.println("不属于枚举类型");
		}
	}
	public static void main(String[] args) {
		enumConstants(EnumClass.CONSTANTS_D);
	}
}
