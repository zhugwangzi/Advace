package char19_stream;
import java.util.Scanner;
public class BRedder{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		float f;
		System.out.println("������������������������������ȡ");
		while(s.hasNextInt()){//�жϵ�ǰ�����Ƿ�Ϊint����
			i=s.nextInt();
			System.out.println(i);
		};
		System.out.println("������С�����������С���������ȡ");
		while(s.hasNextFloat()){//�жϵ�ǰ�����Ƿ�Ϊint����
			f=s.nextFloat();
			System.out.println(f);
		};
		s.close();
	}
}
