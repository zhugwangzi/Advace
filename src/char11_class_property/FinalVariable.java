package char11_class_property;
import java.util.Random;
class A{
	public A(){
		System.out.println("父类构造方法");
	}
	public void printOut() {
		System.out.println("父类方法");
	}
}
public class FinalVariable extends A{
	Random rand=new Random();//实例化一个Random类对象
	private final int i1=rand.nextInt(20);
	private final int i2=rand.nextInt(20);
	public String toString() {//覆盖Object类的toString()方法
		return i1+" "+i2;
	}
	
	public FinalVariable() {
		System.out.println("子类构造方法");
	}
	public void printOut() {
		System.out.println("子类方法");//重写父类方法
	}
	
	public static void main(String[] args) {
		FinalVariable f=new FinalVariable();//实例化一个FinalVariable对象,
			//并且会自动先后调用父类和子类的构造方法
		System.out.println("\n"+f.toString()+"\n");
		f.printOut();
		System.out.println("\n"+f+"\n");//会自动调用被重写的toString()方法
		System.out.println(new FinalVariable());//调用了父类、子类的构造方法和toString方法

	}
}
