package char12_exception;
class MyException extends Exception{//创建自定义异常类
	public MyException(String ErrorMessage) {
		super(ErrorMessage);
	}
}

public class Tran {
	//定义方法并抛出异常
	static int avg(int num1,int num2) throws MyException{
		if(num1>100||num2>100) {
			throw new MyException("数值不可以超过100");
		}
		if(num1<0||num2<0) {
			throw new MyException("不可以使用负数");
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

