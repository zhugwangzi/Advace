package char12_exception;
class StuException extends Exception{
	public StuException(String error) {
		super(error);
	}
}
public class Student {
	void speak(int m) throws StuException{
		if(m>1000) {
			throw new StuException("参数不能大于1000");
		}
	}
	public static void main(String[] args) {
		try {
			Student stu=new Student();
			stu.speak(1001);
		}catch(StuException e) {
			System.out.println(e);
		}
	}

}
