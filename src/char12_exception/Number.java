package char12_exception;

class MultipleException extends Exception{
	String error;
	public MultipleException(String errorMessage) {
		error=errorMessage;
	}
	public String getMessage() {
		return error;
	}
	//第4~10行可以换成这种形式：	
	//public MultipleException(String error) {
	//super(error);
}
public class Number {
	public static int count(int x,int y) throws MultipleException{
		if(x>100||y>100) {
			throw new MultipleException("数值不能大于100");
		}
		if(x<0||y<0) {
			throw new MultipleException("数值不能小于0");
		}
		return x*y;
	}
	public static void main(String[] args) {
		try {
			System.out.println(count(10,2));
		}catch(MultipleException e){
			System.out.println(e);//使用e和使用e.getMessage()方法
				//输出异常的形式不一样
		}
	}
}
