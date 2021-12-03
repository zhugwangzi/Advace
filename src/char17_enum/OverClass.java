package char17_enum;
public class OverClass<T>{
	public T over;
	public void setOver(T over) {
		this.over=over;
	}
	public T getOver() {
		return over;
	}
	public static void main(String[] args) {
		OverClass<Boolean> over1=new OverClass<Boolean>();
		OverClass<Float> over2=new OverClass<Float>();
		over1.setOver(false);
		over2.setOver(3.14f);
		System.out.println(over1.getOver());
		System.out.println(over2.getOver());
	}
}
