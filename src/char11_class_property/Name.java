package char11_class_property;

public class Name {
	int x=0;
	/*Ҫ������ڲ���ķ�������Ҫʵ�����ڲ���Ķ���
	 ���ö�������ڲ���ķ���*/
	Inclass in=new Inclass();
	public void dout() {
		in.doit(10);
	}
	private class Inclass{
		private int x=5;//
		public void doit(int x) {
			System.out.println("�ڲ���ľֲ�����x��"+(++x));
			
			this.x++;
			System.out.println("�ڲ���ĳ�Ա������"+this.x);
			
			Name.this.x++;
			System.out.println("�ⲿ��ĳ�Ա������"+Name.this.x);
		}
	}
	public static void main(String[] args) {
		Name n=new Name();
		n.dout();
	}
}
