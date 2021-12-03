package char19_stream;
import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args) {
		System.out.println("请输入多个数字，遇到非数字就结束");
		Scanner s=new Scanner(System.in);
		int i=0;
		double sum=0;
		while(s.hasNextDouble()) {
			sum=sum+s.nextDouble();
			i++;
		}
		System.out.println("一共有"+i+"个数");
		System.out.println(i+"个数的和为"+sum);
		System.out.println(i+"个数的平均值为"+sum/i);
		s.close();
	}
}
