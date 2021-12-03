package char19_stream;
public class Test {
	public static void main(String[] args) {
		show(new Cat());
		show(new Dog());
	}
	public static void show(Animal a) {
		a.eat();
		if(a instanceof Cat) {
			Cat c=(Cat) a;
			c.work();
		}else if(a instanceof Dog) {
			Dog d=(Dog)a;
			d.work();
		}
	}
}
abstract class Animal{
	abstract void eat();
}
class Cat extends Animal{
	public void eat() {
		System.out.println("Ã¨³ÔÓã");
	}
	public void work() {
		System.out.println("Ã¨×¥ÀÏÊó");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("¹·³Ô¹ÇÍ·");
	}
	public void work() {
		System.out.println("¹·×¥ºÄ×Ó");
	}
}
