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
//����Square�̳и���
class Square extends Quadrangle{
	public Square() {
		System.out.println("������");
	}
}
//����Parallelogramgle�̳и���
class Parallelogramgle extends Quadrangle{
	public Parallelogramgle() {
		System.out.println("ƽ���ı���");
	}
}