package char19_stream;
import java.util.Scanner;
public class BRedder{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		float f;
		System.out.println("请输入整数，如果不是整数则结束读取");
		while(s.hasNextInt()){//判断当前输入是否为int类型
			i=s.nextInt();
			System.out.println(i);
		};
		System.out.println("请输入小数，如果不是小数则结束读取");
		while(s.hasNextFloat()){//判断当前输入是否为int类型
			f=s.nextFloat();
			System.out.println(f);
		};
		s.close();
	}
}
