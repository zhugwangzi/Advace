package char16_reflect;
import java.lang.reflect.Field;
public class Main02 {
	public static void main(String[] args) {
		//采用链式调用方法，获取Example02类中的所有成员变量
		Example02 exam=new Example02();
		
		Field[] declaredFields=exam.getClass().getDeclaredFields();
		for(int i=0;i<declaredFields.length;i++) {
			Field field=declaredFields[i];
			System.out.println("第"+i+"个成员变量的名称："
					+field.getName());
			Class fieldType=field.getType();
			System.out.println("第"+i+"个成员变量的类型："
					+fieldType);
			boolean isTrue=true;
			while(isTrue) {
				try {
					isTrue=false;
					System.out.println("第"+i+"个成员变量的初始值为："
							+field.get(exam));
					if(fieldType.equals(int.class)){
						System.out.println("调用setInt()方法修改该变量的值");
						field.setInt(exam,100);
					}else if(fieldType.equals(float.class)){
						System.out.println("调用setInt()方法修改该变量的值");
						field.setFloat(exam,99.9f);
					}else if(fieldType.equals(boolean.class)){
						System.out.println("调用setInt()方法修改该变量的值");
						field.setBoolean(exam,true);
					}else{
						System.out.println("调用setInt()方法修改该变量的值");
						field.set(exam,"hello");
					}
					System.out.println("修改后的值为："+field.get(exam));
				}catch(Exception e) {
					System.out.println("修改变量值时出现异常，下面执行"
							+ "setAccessible()方法！");
					field.setAccessible(true);
					isTrue=true;
				}
			}
			System.out.println();
		}
	}
}
