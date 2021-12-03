package char17_enum;
public class Test1 {
	enum EnumClass{
		CONSTANTS_A("��Ա1"),
		CONSTANTS_B("��Ա2"),
		CONSTANTS_C("��Ա3"),
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
				System.out.println("������ö������");
		}
	}
	public static void main(String[] args) {
		enumConstants(EnumClass.CONSTANTS_D);
	}
}
