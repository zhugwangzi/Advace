package char07_classobject;
public class Quiz {
	static int i=66;//�����Ա����
	public void call() {//�����Ա����
		System.out.println("���ó�Ա����call()");
		for(i=0;i<3;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//������������
		Quiz a1=new Quiz();
		Quiz a2=new Quiz();
		
		a2.i=88;
		System.out.println("a1���ó�Ա������i="+a1.i++);
		System.out.println(i);
		a1.call();//a1���ó�Ա����
		System.out.println("a2���ó�Ա������i="+a2.i);
		a2.call();//a2���ó�Ա����
		
	}
}	

