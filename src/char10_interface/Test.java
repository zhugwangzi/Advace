package char10_interface;
interface draw1{
	public void doit();
}
class T1 extends Test implements draw1{
	public void doit() {
		System.out.println("T1��doit()����");
	}
}
class T2 extends Test implements draw1{
	public void doit() {
		System.out.println("T2���doit()����");
	}
}
class T3 extends Test{
	public void doit() {
		System.out.println("T3���doit()����");
	}
}
public class Test{
	public static void main(String[] args) {
		draw1[] d= {new T1(),new T2()};
		System.out.print("{");
		for(int i=0;i<d.length;i++) {
			System.out.print(i==d.length-1?d[i]+"}":d[i]+",");
		}
	}
}