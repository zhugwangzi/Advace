package char16_reflect;
import java.lang.reflect.Field;
public class Main02 {
	public static void main(String[] args) {
		//������ʽ���÷�������ȡExample02���е����г�Ա����
		Example02 exam=new Example02();
		
		Field[] declaredFields=exam.getClass().getDeclaredFields();
		for(int i=0;i<declaredFields.length;i++) {
			Field field=declaredFields[i];
			System.out.println("��"+i+"����Ա���������ƣ�"
					+field.getName());
			Class fieldType=field.getType();
			System.out.println("��"+i+"����Ա���������ͣ�"
					+fieldType);
			boolean isTrue=true;
			while(isTrue) {
				try {
					isTrue=false;
					System.out.println("��"+i+"����Ա�����ĳ�ʼֵΪ��"
							+field.get(exam));
					if(fieldType.equals(int.class)){
						System.out.println("����setInt()�����޸ĸñ�����ֵ");
						field.setInt(exam,100);
					}else if(fieldType.equals(float.class)){
						System.out.println("����setInt()�����޸ĸñ�����ֵ");
						field.setFloat(exam,99.9f);
					}else if(fieldType.equals(boolean.class)){
						System.out.println("����setInt()�����޸ĸñ�����ֵ");
						field.setBoolean(exam,true);
					}else{
						System.out.println("����setInt()�����޸ĸñ�����ֵ");
						field.set(exam,"hello");
					}
					System.out.println("�޸ĺ��ֵΪ��"+field.get(exam));
				}catch(Exception e) {
					System.out.println("�޸ı���ֵʱ�����쳣������ִ��"
							+ "setAccessible()������");
					field.setAccessible(true);
					isTrue=true;
				}
			}
			System.out.println();
		}
	}
}
