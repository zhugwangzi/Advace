package char12_exception;
class DivisorException extends Exception{
	public DivisorException(String message) {
		super(message);
	}
}
public class MaxCommonDivisor {
	static void maxDivisor(int x,int y) throws DivisorException{
		if(y<0) {
			throw new DivisorException("除数不能是负数");
		}
		int n=0;//最大公约数
		for(int i=1;i<=x&&i<=y;i++) {
			if(x%i==0&&y%i==0) {
				n=i;
			}
		}
		System.out.println("maxDivisor("+x+","+y+")="+n);
	}
	public static void main(String[] args) {
		try {
			maxDivisor(100,4);
		}catch(DivisorException e) {
			System.out.println(e);
		}
	}
}
