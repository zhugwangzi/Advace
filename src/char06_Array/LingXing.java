package char06_Array;

public class LingXing {
	public static void main(String[] args) {
		//���Ʊ߳���5��*�����Σ�
		System.out.println("��ӡ����");
		//�ȴ�ӡǰ5��
		for(int i=1;i<6;i++) {			 		//i������
			for(int j=5;j-i>0;j--) {				//j�ǵ�i�пո���
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {	//k�ǵ�i��*��
				System.out.print("*");
			}
			System.out.println();
		}
		//��ӡ��4��
		for(int i=1;i<5;i++) {			 		//i������
			for(int j=1;j<=i;j++) {				//j�ǵ�i�пո���
				System.out.print("  ");
			}
			for(int k=1;k<=9-2*i;k++) {//k�ǵ�i��*��
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
