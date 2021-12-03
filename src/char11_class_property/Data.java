package char11_class_property;
import java.util.Random;
import static java.lang.System.out;

public class Data {
	private static Random rand=new Random();
	//final修饰的变量可以改变值
	private final int a1=rand.nextInt(10);
	//final static 修饰的变量无法改变值
	private static final int a2=rand.nextInt(10);
	
	public static void main(String[] args) {
		Data data=new Data();
		out.println("实例化对象data访问变量a1："+data.a1);
		out.println("实例化对象data访问变量a2："+data.a2);
		
		Data data2=new Data();
		out.println("实例化对象data访问变量a1："+data2.a1);
		out.println("实例化对象data访问变量a2："+data2.a2);
	}

}
