package char06_Array;

public class LingXing1 {
	public static void main(String[] args) {
		/*����һ����*���ɵĿ������Σ�
		 * �޸ı߳�����a���Կ������εĴ�С*/
		
		int a=7;//��������޸�a��ֵ
		//�ȴ�ӡ���ε�ǰa��
		/*��ӡ���i�е�a-i���ո��
		   *�ٴ�ӡһ��* */
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
				}
			System.out.print("*");
		/*��ӡ��i�е�2i-3���ո��
		  *�ٴ�ӡһ��* */
			for(int k=1;k<=2*i-3;k++) {
				System.out.print(" ");
			}
			if(i==1) {//��һ��ֱ�ӻ��У������ӡ*�ٻ���
				System.out.println();
			}else {
				System.out.println("*");
			}
		}
		//��ӡ�����a-1��
		/*��ӡ��i�е�i���ո��ٴ�ӡһ��**/
		for(int i=1;i<a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
				}
			System.out.print("*");
		/*��ӡ��i�е�2(a-i)-3���ո��,�ٴ�ӡһ��* */
			for(int k=1;k<=2*(a-i)-3;k++) {
				System.out.print(" ");
			}
			if(i==a-1) {//�������һ�У�ֱ�ӽ���ѭ���������ӡ*�ٻ���
				break;
			}else {
				System.out.println("*");
			}
		}
	}
}
