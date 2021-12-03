package char11_class_property;

public class Name {
	int x=0;
	/*要想调用内部类的方法，需要实例化内部类的对象，
	 再用对象调用内部类的方法*/
	Inclass in=new Inclass();
	public void dout() {
		in.doit(10);
	}
	private class Inclass{
		private int x=5;//
		public void doit(int x) {
			System.out.println("内部类的局部变量x："+(++x));
			
			this.x++;
			System.out.println("内部类的成员变量："+this.x);
			
			Name.this.x++;
			System.out.println("外部类的成员变量："+Name.this.x);
		}
	}
	public static void main(String[] args) {
		Name n=new Name();
		n.dout();
	}
}
