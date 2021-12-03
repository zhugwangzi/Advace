package char14_collection;
import java.util.*;
public class Night{
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("df");
		list.add("df f!");
		list.add("dfu&");
		list.add("34");
		list.add("ty45");
		int i=(int) (Math.random()*(list.size()));
		System.out.println("随机获取元素："+list.get(i));
		list.remove(i);
		System.out.print("移除该元素后数组：");
		for(String x:list) {
			System.out.print(x+" ");
		}
		System.out.println();
		list.set(i,"1");
		System.out.print("修改原来下标的元素为1后数组为");
		for(String x:list) {
			System.out.print(x+" ");
		}
	}
}
