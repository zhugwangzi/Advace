package char16_reflect;
public class ShowEnum {
	enum Constants{//�ѳ�������ö��������
		CONSTANT_A,CONSTANT_B
	}
	public static void compare(Constants x) {
		System.out.println(x+"��CONSATNT_A�ıȽϽ����"
				+x.compareTo(Constants.CONSTANT_A));
	}
	public static void main(String[] args) {
		Constants[] c=Constants.values();
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
			compare(c[i]);
		}
		compare(Constants.valueOf("CONSTANT_A"));
		System.out.println("CONSTANT_A��λ�ã�"+Constants.CONSTANT_A.ordinal());
		System.out.println("CONSTANT_B��λ�ã�"+Constants.CONSTANT_B.ordinal());
	}
}
