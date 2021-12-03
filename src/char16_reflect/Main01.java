package char16_reflect;
import java.lang.reflect.Constructor;
public class Main01 {
	public static void main(String[] args) {
		Class c=new Example_01().getClass();//����Example01�����ڵ�Class�࣬��ֵ��c  
		Constructor[] constructor=c.getDeclaredConstructors();//��ȡ���췽������
		for(int i=0;i<constructor.length;i++) {//��������
			Constructor con=constructor[i];
			System.out.println("\n��"+i+"�����췽���Ƿ���пɱ������Ĳ�����"
					+con.isVarArgs());
			
			System.out.println("��"+i+"�����췽������ڲ�������Ϊ��");
			Class[] parameter=con.getParameterTypes();//��ȡClass���͵���ڲ�������
			for(int j=0;j<parameter.length;j++) {//������������Ԫ��
				System.out.println(parameter[j]);
			}
			
			Class[] exception=con.getExceptionTypes();//��ȡClass���͵��쳣��������
			System.out.println("�ù��췽�������׳����쳣����Ϊ��");
			for(int j=0;j<exception.length;j++) {//������������Ԫ��
				System.out.println(exception[j]);
			}
			
			Example_01 example01=null;
			while(example01==null) {//�����췽��[i]��������
				try {
					if(parameter.length==0) {//�޲ι��췽��
						example01=(Example_01)con.newInstance();
					}else if(parameter.length==2) {//���������Ĺ��췽��
						example01=(Example_01)con.newInstance("hi",5);
					}else{//�ɱ䳤�����Ĺ��췽��
						Object[] varParameter=new Object[] {new String[] {"100","200","300"}};
						example01=(Example_01)con.newInstance(varParameter);
					}
				}catch(Exception e) {
					System.out.println("��������ʱ�׳��쳣������ִ��setAccessible()����");
					con.setAccessible(true);
				}
			}
			example01.print();
			System.out.println(example01);
		}
	}
}
