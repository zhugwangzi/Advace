package char16_reflect;
import java.lang.reflect.Method;
public class Main03 {
	public static void main(String[] args) {
		Example03 exam=new Example03();
		Method[] declaredMethods=exam.getClass().getDeclaredMethods();
		for(int i=0;i<declaredMethods.length;i++) {
			Method method=declaredMethods[i];
			System.out.println("��õķ��������е�"+i+"�����������֣�"+method.getName());
			System.out.println("�Ƿ���пɱ������Ĳ�����"+method.isVarArgs());
			System.out.println("�÷��������в������ͣ�");
			Class[] parameter=method.getParameterTypes();
			for(int j=0;j<parameter.length;j++) {
				System.out.println(parameter[j]);
			}
			System.out.println("�÷����ķ���ֵ����Ϊ��"+method.getReturnType());
			System.out.println("�÷��������׳����쳣���ͣ�");
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
