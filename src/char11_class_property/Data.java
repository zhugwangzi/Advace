package char11_class_property;
import java.util.Random;
import static java.lang.System.out;

public class Data {
	private static Random rand=new Random();
	//final���εı������Ըı�ֵ
	private final int a1=rand.nextInt(10);
	//final static ���εı����޷��ı�ֵ
	private static final int a2=rand.nextInt(10);
	
	public static void main(String[] args) {
		Data data=new Data();
		out.println("ʵ��������data���ʱ���a1��"+data.a1);
		out.println("ʵ��������data���ʱ���a2��"+data.a2);
		
		Data data2=new Data();
		out.println("ʵ��������data���ʱ���a1��"+data2.a1);
		out.println("ʵ��������data���ʱ���a2��"+data2.a2);
	}

}
