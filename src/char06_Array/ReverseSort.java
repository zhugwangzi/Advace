package char06_Array;

public class ReverseSort {
	public static void main(String[] args) {
			int a[]= {1,6,4,0,9};
			System.out.println("用循环语句实现反转排序：");
			for(int i=0;i<a.length/2;i++) {
				int b=a[i];//a[i]和a[a.length-i]交换
				a[i]=a[a.length-i-1];
				a[a.length-i-1]=b;
				for(int x:a) {
					System.out.print(x+" ");
				}
				System.out.println();
			}
	}

}
