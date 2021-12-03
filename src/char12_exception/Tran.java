package char12_exception;
class MyException extends Exception{//�����Զ����쳣��
	public MyException(String ErrorMessage) {
		super(ErrorMessage);
	}
}

public class Tran {
	//���巽�����׳��쳣
	static int avg(int num1,int num2) throws MyException{
		if(num1>100||num2>100) {
			throw new MyException("��ֵ�����Գ���100");
		}
		if(num1<0||num2<0) {
			throw new MyException("������ʹ�ø���");
		}
		return (num1+num2)/2;
	}
	public static void main(String[] args) {
		try{
			System.out.println(avg(-102,140));
		}catch(MyException e){
			System.out.println(e);
		}
	}
}

