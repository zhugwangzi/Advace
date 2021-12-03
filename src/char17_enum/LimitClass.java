package char17_enum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LimitClass{
	public static void main(String[] args) {
		List<String> l1=new  ArrayList<String>();
		List<?> l2=l1;
		List<?> l3=new LinkedList<Integer>();
		l1.add("成员1");
		l1.add("成员2");
		l1.add("成员3");
		System.out.println("使用for循环输出l1的元素：");
		for(int i=0;i<l1.size();i++){
			System.out.print(l1.get(i)+" ");
		}
		System.out.println("使用迭代器输出l2的元素：");
		Iterator<?> it=l2.iterator();
		while(it.hasNext()) {
			System.out.print((String)it.next()+" ");
		}
		
		System.out.println("修改元素：");
		l1.set(0,"改变成员1");
		System.out.println(l1.get(0));
		l2.remove(1);
		System.out.println(l2.get(1));
		
	}

}
