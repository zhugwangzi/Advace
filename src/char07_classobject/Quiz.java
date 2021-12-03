package char07_classobject;
public class Quiz {
	static int i=66;//定义成员变量
	public void call() {//定义成员方法
		System.out.println("调用成员方法call()");
		for(i=0;i<3;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//创建两个对象
		Quiz a1=new Quiz();
		Quiz a2=new Quiz();
		
		a2.i=88;
		System.out.println("a1调用成员变量后i="+a1.i++);
		System.out.println(i);
		a1.call();//a1调用成员方法
		System.out.println("a2调用成员变量后i="+a2.i);
		a2.call();//a2调用成员方法
		
	}
}	

