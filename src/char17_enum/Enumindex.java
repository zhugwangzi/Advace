package char17_enum;
interface Enum{
	public String getDescription();
	public int getI();
}
public enum Enumindex implements Enum{
		CONSTANTS_A{
			public String getDescription() {
				return "ö�ٳ�Ա1";
			}
			public int getI() {
				return 1;
			}
		},
		CONSTANTS_B{
			public String getDescription() {
				return "ö�ٳ�Ա3";
			}
			public int getI() {
				return 3;
			}
		},
		CONSTANTS_C{
			public String getDescription() {
				return "ö�ٳ�Ա2";
			}
			public int getI() {
				return 2;
			}
		},
		CONSTANTS_D{
			public String getDescription() {
				return "ö�ٳ�Ա4";
			}
			public int getI() {
				return 4;
			}
		};
	public static void main(String[] args) {
		Enumindex[] c=Enumindex.values();
		for(Enumindex x:c) {
			System.out.println(x+"�������ǣ�"+x.ordinal());
			System.out.println(x+"�������ǣ�"+x.getDescription());
			System.out.println(x+"������ǣ�"+x.getI());
		}
		System.out.println(Enumindex.valueOf("CONSTANTS_C").compareTo(Enumindex.CONSTANTS_A));
		
	}
}
