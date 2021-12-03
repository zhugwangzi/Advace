package char16_reflect;
public class Example_01 {
	int i1,i2,i3;
	String s;
	public Example_01(String s,int i) {
		this.s=s;
		i1=i;
	}
	public Example_01() {
	}
	public Example_01(String...strings) throws NumberFormatException{
		if(strings.length>0) {
			i1=Integer.valueOf(strings[0]);//返回strings[0]表示的Integer值
		}
		if(strings.length>1) {
			i2=Integer.valueOf(strings[1]);
		}
		if(strings.length>2) {
			i3=Integer.valueOf(strings[2]);
		}
	}
	public void print() {
		System.out.println("赋值后四个变量的值为：");
		System.out.println("s="+s);
		System.out.println("i1="+i1);
		System.out.println("i2="+i2);
		System.out.println("i3="+i3);
	}
}