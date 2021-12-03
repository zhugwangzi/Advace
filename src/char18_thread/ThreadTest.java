package char18_thread;
public class ThreadTest extends Thread{
	int i=10;
	public void run(){
		while(true) {
			System.out.print(i+" ");
			if(--i==0) {
				return;
			}
		}
	}
	public static void main(String[] args) {
		new ThreadTest().start();
	}
}
