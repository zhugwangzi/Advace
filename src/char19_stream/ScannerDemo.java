package char19_stream;
import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args) {
		System.out.println("�����������֣����������־ͽ���");
		Scanner s=new Scanner(System.in);
		int i=0;
		double sum=0;
		while(s.hasNextDouble()) {
			sum=sum+s.nextDouble();
			i++;
		}
		System.out.println("һ����"+i+"����");
		System.out.println(i+"�����ĺ�Ϊ"+sum);
		System.out.println(i+"������ƽ��ֵΪ"+sum/i);
		s.close();
	}
}
