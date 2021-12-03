package char16_reflect;
import java.lang.reflect.Constructor;
public class Main01 {
	public static void main(String[] args) {
		Class c=new Example_01().getClass();//返回Example01类所在的Class类，赋值给c  
		Constructor[] constructor=c.getDeclaredConstructors();//获取构造方法数组
		for(int i=0;i<constructor.length;i++) {//遍历数组
			Constructor con=constructor[i];
			System.out.println("\n第"+i+"个构造方法是否带有可变数量的参数："
					+con.isVarArgs());
			
			System.out.println("第"+i+"个构造方法的入口参数类型为：");
			Class[] parameter=con.getParameterTypes();//获取Class类型的入口参数数组
			for(int j=0;j<parameter.length;j++) {//输出参数数组的元素
				System.out.println(parameter[j]);
			}
			
			Class[] exception=con.getExceptionTypes();//获取Class类型的异常类型数组
			System.out.println("该构造方法可能抛出的异常类型为：");
			for(int j=0;j<exception.length;j++) {//输出参数数组的元素
				System.out.println(exception[j]);
			}
			
			Example_01 example01=null;
			while(example01==null) {//给构造方法[i]创建对象
				try {
					if(parameter.length==0) {//无参构造方法
						example01=(Example_01)con.newInstance();
					}else if(parameter.length==2) {//两个参数的构造方法
						example01=(Example_01)con.newInstance("hi",5);
					}else{//可变长参数的构造方法
						Object[] varParameter=new Object[] {new String[] {"100","200","300"}};
						example01=(Example_01)con.newInstance(varParameter);
					}
				}catch(Exception e) {
					System.out.println("创建对象时抛出异常，下面执行setAccessible()方法");
					con.setAccessible(true);
				}
			}
			example01.print();
			System.out.println(example01);
		}
	}
}
