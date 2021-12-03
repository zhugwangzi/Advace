package char10_interface;

public class Quadrangle {
	private Quadrangle[] q=new Quadrangle[6];
	private int index=0;
	public void draw(Quadrangle a) {
		if(index<q.length) {
			q[index]=a;
			System.out.println(index);
			index++;
		}
	}
	
	public static void main(String[] args) {
		Quadrangle q=new Quadrangle();
		q.draw(new Square());
		q.draw(new Parallelogramgle());
	}
}
//子类Square继承父类
class Square extends Quadrangle{
	public Square() {
		System.out.println("正方形");
	}
}
//子类Parallelogramgle继承父类
class Parallelogramgle extends Quadrangle{
	public Parallelogramgle() {
		System.out.println("平行四边形");
	}
}