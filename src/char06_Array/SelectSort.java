package char06_Array;

public class SelectSort{
	public static void main(String[] args) {
		int[] a=new int[] {9,8,7,6,5,4,3,2,1,0};
		System.out.print("排序前数组元素：");
		for(int x:a) {//输出排序前数组元素
			System.out.print((x==a[a.length-1])?x+"\n":x+",");
		}
		
		SelectSort sorter=new SelectSort();//创建对象sorter
		sorter.sort(a);//访问sort()方法进行排序
		System.out.print("从小到大排序后数组元素：");
		for(int x:a){
			System.out.print((x==a[a.length-1])?x+"\n":x+",");
		}
	}
	//构造sort()方法，选择排序
	public void sort(int[] b) {
		for(int i=1;i<b.length;i++){//有b.length-1轮排序
			int index=0;//设置较大值的索引
			for(int j=1;j<=b.length-i;j++) {/*b[1]~b[b.length-i]依次
				与b[index]比较大小*/
				index=(b[j]>b[index])?j:index;//获取较大值的索引
			}
			//交换每一轮最大数的位置
			int p=b[b.length-i];
			b[b.length-i]=b[index];
			b[index]=p;
			//输出第i轮排序后的数组元素
			System.out.print("第"+i+"轮排序结果：");
			for(int x:b) {
				System.out.print((x==b[b.length-1])?x+"\n":x+",");
			}
		}
	}
}