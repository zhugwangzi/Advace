package char10_interface;

public class Practice1 {
	private int variable;//�����Ա����
	public void setValue(int value) {//�����Ա������ֵ
		this.variable=value;
	}
	public int getValue() {//�����Ա����
		this.setValue(5);
		System.out.println("����ֵ��"+variable);
		return this.variable;
	}
	
	public static void main(String[] args) {
		Practice1 p=new Practice1();
		p.getValue();
	}
}
