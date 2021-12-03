package char14_collection;
import java.util.*;

public class UpdateStu implements Comparable<Object>{//实现CompareTo接口
	 String name;
	 long id;
	 public UpdateStu(String name,long id) {//构造方法
		 this.name=name;
		 this.id=id;
	 }
	 //第12~17行可以删除，后面用stu.访问name和id
	 public String getName() {//获取name
		 return name;
	 }
	 public long getId() {//获取id
		 return id;
	 }
	 public int compareTo(Object o) {//重写compareTo方法
		 UpdateStu upstu=(UpdateStu) o;
		 int result=id>upstu.id?1:(id==upstu.id?0:-1);
		 return result;
	 }
	public static void main(String[] args) {
		//实例化4个对象，并且赋值内容
		UpdateStu stu1=new UpdateStu("李同学", 01011);
		UpdateStu stu2=new UpdateStu("王同学", 01023);
		UpdateStu stu3=new UpdateStu("章同学", 01032);
		UpdateStu stu4=new UpdateStu("赵同学", 01005);
		TreeSet<UpdateStu> tree=new TreeSet<>();//创建未赋值的tree对象
		tree.add(stu1);//添加元素
		tree.add(stu2);
		tree.add(stu3);
		tree.add(stu4);
		Iterator<UpdateStu> it=tree.iterator();//创建迭代器赋值给集合对象it
		System.out.println("set集合中的所有元素：");//输出元素
		while(it.hasNext()) {//遍历所有元素
			UpdateStu stu=(UpdateStu) it.next();
			//输出顺序是按照学号排名，不是stu1~stu4
			System.out.println(stu.name+","+stu.id);
		}
		System.out.println("截取stu2前面的元素：");
		it=tree.headSet(stu2).iterator();//截取stu2前面的学生
		while(it.hasNext()) {
			UpdateStu stu=(UpdateStu) it.next();
			System.out.println(stu.getName()+","+stu.getId());
		}
		System.out.println("截取后的元素");
		it=tree.subSet(stu4,stu3).iterator();//截取stu4~stu3的学生
		while(it.hasNext()) {
			UpdateStu stu=(UpdateStu) it.next();
			System.out.println(stu.getName()+","+stu.getId());
		}
	}
}
