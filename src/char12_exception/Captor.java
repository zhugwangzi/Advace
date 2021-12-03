package char12_exception;
 class NewException extends Exception{
	 public NewException(String errorMessage) {
		 super(errorMessage);
	 }
 }
 
 public class Captor{
	 public static int division(int a,int b) throws NewException{
		 if(b<0) {
			 throw new NewException("除数不能是负数");
		 }
		 return a/b;
	 }
	 public static void main(String[] args) {
		try {
			int result=division(3,-7);
		}catch(NewException e) {
			System.out.println(e);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}catch(Exception e) {
			 System.out.println(e);
		 }
	}
 }