package char12_exception;

class MultipleException extends Exception{
	String error;
	public MultipleException(String errorMessage) {
		error=errorMessage;
	}
	public String getMessage() {
		return error;
	}
	//��4~10�п��Ի���������ʽ��	
	//public MultipleException(String error) {
	//super(error);
}
public class Number {
	public static int count(int x,int y) throws MultipleException{
		if(x>100||y>100) {
			throw new MultipleException("��ֵ���ܴ���100");
		}
		if(x<0||y<0) {
			throw new MultipleException("��ֵ����С��0");
		}
		return x*y;
	}
	public static void main(String[] args) {
		try {
			System.out.println(count(10,2));
		}catch(MultipleException e){
			System.out.println(e);//ʹ��e��ʹ��e.getMessage()����
				//����쳣����ʽ��һ��
		}
	}
}
