package char06_Array;

public class ReverseSort {
	public static void main(String[] args) {
			int a[]= {1,6,4,0,9};
			System.out.println("��ѭ�����ʵ�ַ�ת����");
			for(int i=0;i<a.length/2;i++) {
				int b=a[i];//a[i]��a[a.length-i]����
				a[i]=a[a.length-i-1];
				a[a.length-i-1]=b;
				for(int x:a) {
					System.out.print(x+" ");
				}
				System.out.println();
			}
	}

}
