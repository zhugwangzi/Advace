package char06_Array;
import java.util.Arrays;
public class QuickSort{
	static int k=0;//������������k
	public static void main(String[] args) {
		int a[]={9,8,7,6,5,4,3,2,1};
		System.out.println("��0�����������Ϊ��"+Arrays.toString(a));//�������
		quicksort(a,0,a.length-1);//����quicksort()��������
		System.out.println("��������飺"+Arrays.toString(a));//�������
	}
	//����quicksort()����
	private static void quicksort(int[] a, int low, int high) {
		int i,j;
		if (low>high) {//low>highʱ��������
			return;
		}
		i=low;
		j=high;
		int temp=a[low];//��׼ֵ
		//ִ�з�������
		while(i<j){
			while ( temp<=a[j] && i<j) {//���������ң�ֱ���Ȼ�׼С
				j--;
			}
			while ( temp>=a[i] && i<j) {//���������ң�ֱ���Ȼ�׼��
				i++;
			}
			if (i<j) {//���� i<j ʱ��С������ߣ��������ұ�
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}//ѭ������ʱi=j
		a[low]=a[i];//����׼��a[i]����
		a[i]=temp;//��ʱ�����Ϊ3���֣�a[low]~a[i-1],a[i],a[i+1]~a[high]
		System.out.println("��"+(++k)+"�����������Ϊ��"+
				Arrays.toString(a));
		quicksort(a, low, i-1);//��ݹ�
		quicksort(a, i+1, high);	//�ҵݹ�
	}
}
