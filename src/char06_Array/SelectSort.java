package char06_Array;

public class SelectSort{
	public static void main(String[] args) {
		int[] a=new int[] {9,8,7,6,5,4,3,2,1,0};
		System.out.print("����ǰ����Ԫ�أ�");
		for(int x:a) {//�������ǰ����Ԫ��
			System.out.print((x==a[a.length-1])?x+"\n":x+",");
		}
		
		SelectSort sorter=new SelectSort();//��������sorter
		sorter.sort(a);//����sort()������������
		System.out.print("��С�������������Ԫ�أ�");
		for(int x:a){
			System.out.print((x==a[a.length-1])?x+"\n":x+",");
		}
	}
	//����sort()������ѡ������
	public void sort(int[] b) {
		for(int i=1;i<b.length;i++){//��b.length-1������
			int index=0;//���ýϴ�ֵ������
			for(int j=1;j<=b.length-i;j++) {/*b[1]~b[b.length-i]����
				��b[index]�Ƚϴ�С*/
				index=(b[j]>b[index])?j:index;//��ȡ�ϴ�ֵ������
			}
			//����ÿһ���������λ��
			int p=b[b.length-i];
			b[b.length-i]=b[index];
			b[index]=p;
			//�����i������������Ԫ��
			System.out.print("��"+i+"����������");
			for(int x:b) {
				System.out.print((x==b[b.length-1])?x+"\n":x+",");
			}
		}
	}
}