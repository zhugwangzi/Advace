package char12_exception;

public class Take{
	static void pop() throws NegativeArraySizeException{
		int[] a=new int[-2];
	}
	public static void main(String[] args) {
		try {
			pop();
		}catch(NegativeArraySizeException e) {
			System.out.println(e);
		}
	}
}
