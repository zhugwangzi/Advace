package char17_enum;
interface Enum{
	public String getDescription();
	public int getI();
}
public enum Enumindex implements Enum{
		CONSTANTS_A{
			public String getDescription() {
				return "枚举成员1";
			}
			public int getI() {
				return 1;
			}
		},
		CONSTANTS_B{
			public String getDescription() {
				return "枚举成员3";
			}
			public int getI() {
				return 3;
			}
		},
		CONSTANTS_C{
			public String getDescription() {
				return "枚举成员2";
			}
			public int getI() {
				return 2;
			}
		},
		CONSTANTS_D{
			public String getDescription() {
				return "枚举成员4";
			}
			public int getI() {
				return 4;
			}
		};
	public static void main(String[] args) {
		Enumindex[] c=Enumindex.values();
		for(Enumindex x:c) {
			System.out.println(x+"的索引是："+x.ordinal());
			System.out.println(x+"的内容是："+x.getDescription());
			System.out.println(x+"的序号是："+x.getI());
		}
		System.out.println(Enumindex.valueOf("CONSTANTS_C").compareTo(Enumindex.CONSTANTS_A));
		
	}
}
