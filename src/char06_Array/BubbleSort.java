package char06_Array;


public class BubbleSort {
	public static void main(String[] args) {
		int[] a=new int[] {9,8,7,6,5,4,3,2,1,0};
		System.out.print("排序前数组元素：");
		for(int x:a) {
			System.out.print((x==a[a.length-1])?x+"\n":x+",");
			}
		
		BubbleSort sorter=new BubbleSort();//创建冒泡排序的对象sorter
		sorter.sort(a);//访问sort()方法进行排序
		System.out.print("从小到大排序后数组元素：");
		for(int x:a) {//输出排序后的数组元素
			System.out.print((x==a[a.length-1])?x+"\n":x+",");
		}
	}
	//构造sort()方法，冒泡排序
	public void sort(int[] b) {
		for(int i=1;i<b.length;i++) {//外循环有length-1次
			for(int j=0;j<b.length-i;j++) {
				if(b[j]>b[j+1]) {//若前者大于后者则交换位置
					int p=b[j+1];
					b[j+1]=b[j];
					b[j]=p;
				}
			}
			System.out.print("第"+i+"轮排序结果：");
			for(int x:b) {//输出排序后的数组元素
				System.out.print((x==b[b.length-1])?x+"\n":x+",");
			}
		}
	}
}