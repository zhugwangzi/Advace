package char06_Array;


public class BubbleSort {
	public static void main(String[] args) {
		int[] a=new int[] {9,8,7,6,5,4,3,2,1,0};
		System.out.print("����ǰ����Ԫ�أ�");
		for(int x:a) {
			System.out.print((x==a[a.length-1])?x+"\n":x+",");
			}
		
		BubbleSort sorter=new BubbleSort();//����ð������Ķ���sorter
		sorter.sort(a);//����sort()������������
		System.out.print("��С�������������Ԫ�أ�");
		for(int x:a) {//�������������Ԫ��
			System.out.print((x==a[a.length-1])?x+"\n":x+",");
		}
	}
	//����sort()������ð������
	public void sort(int[] b) {
		for(int i=1;i<b.length;i++) {//��ѭ����length-1��
			for(int j=0;j<b.length-i;j++) {
				if(b[j]>b[j+1]) {//��ǰ�ߴ��ں����򽻻�λ��
					int p=b[j+1];
					b[j+1]=b[j];
					b[j]=p;
				}
			}
			System.out.print("��"+i+"����������");
			for(int x:b) {//�������������Ԫ��
				System.out.print((x==b[b.length-1])?x+"\n":x+",");
			}
		}
	}
}