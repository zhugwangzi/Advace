package char16_reflect;
import java.lang.reflect.Method;
public class Main03 {
	public static void main(String[] args) {
		Example03 exam=new Example03();
		Method[] declaredMethods=exam.getClass().getDeclaredMethods();
		for(int i=0;i<declaredMethods.length;i++) {
			Method method=declaredMethods[i];
			System.out.println("获得的方法数组中第"+i+"个方法的名字："+method.getName());
			System.out.println("是否带有可变数量的参数："+method.isVarArgs());
			System.out.println("该方法的所有参数类型：");
			Class[] parameter=method.getParameterTypes();
			for(int j=0;j<parameter.length;j++) {
				System.out.println(parameter[j]);
			}
			System.out.println("该方法的返回值类型为："+method.getReturnType());
			System.out.println("该方法可能抛出的异常类型：");
			Class[] exception=method.getExceptionTypes();
			for(int j=0;j<exception.length;j++) {
				System.out.println(exception[j]);
			}
			
			boolean b=true;
			while(b) {
				try {
					b=false;
					if("staticMethod".equals(method.getName())) {
						method.invoke(exam);
					}else if("publicMethod".equals(method.getName())) {
						System.out.println(method.invoke(exam,10));
					}else if("protectedMethod".equals(method.getName())) {
						System.out.println(method.invoke(exam,"7",3));
					}else{
						Object[] parameters=new Object[]{new String[]{"Hi!"," i'm"," tom!"}};
						System.out.println(method.invoke(exam,parameters));
					}
				}catch(Exception e) {
					method.setAccessible(true);
					b=true;
				}
			}
			System.out.println();
		}
	}

}
