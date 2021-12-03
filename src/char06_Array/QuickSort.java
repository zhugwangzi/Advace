package char06_Array;
import java.util.Arrays;
public class QuickSort{
	static int k=0;//设置排序轮数k
	public static void main(String[] args) {
		int a[]={9,8,7,6,5,4,3,2,1};
		System.out.println("第0轮排序后数组为："+Arrays.toString(a));//输出数组
		quicksort(a,0,a.length-1);//访问quicksort()方法排序
		System.out.println("排序后数组："+Arrays.toString(a));//输出数组
	}
	//定义quicksort()方法
	private static void quicksort(int[] a, int low, int high) {
		int i,j;
		if (low>high) {//low>high时方法结束
			return;
		}
		i=low;
		j=high;
		int temp=a[low];//基准值
		//执行分区操作
		while(i<j){
			while ( temp<=a[j] && i<j) {//从右往左找，直到比基准小
				j--;
			}
			while ( temp>=a[i] && i<j) {//从左往右找，直到比基准大
				i++;
			}
			if (i<j) {//满足 i<j 时较小数放左边，大数放右边
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}//循环结束时i=j
		a[low]=a[i];//将基准与a[i]交换
		a[i]=temp;//此时数组分为3部分：a[low]~a[i-1],a[i],a[i+1]~a[high]
		System.out.println("第"+(++k)+"轮排序后数组为："+
				Arrays.toString(a));
		quicksort(a, low, i-1);//左递归
		quicksort(a, i+1, high);	//右递归
	}
}
