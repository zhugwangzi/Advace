package char18_thread;
class RunnalbleDemo implements Runnable{
	private String threadName;
	private Thread t;
	public RunnalbleDemo(String name) {
		threadName=name;
		System.out.println("Creating "+threadName);
	}
	public void run() {
		System.out.println("Running "+threadName);
		try {
			for(int i=0;i<2;i++) {
				System.out.println("Thread: "+threadName+","+i);
				Thread.sleep(50);
			}
		}catch(InterruptedException e) {
			System.out.println("Thread "+threadName+"interrupted.");
		}
		System.out.println("Thread: "+threadName+" exiting");
	}
	public void start() {
		System.out.println("Starting "+threadName);
		if(t==null) {
			t=new Thread(this,threadName);
			t.start();
		}
	}
}
public class ThreadTest1{
	public static void main(String[] args) {
		RunnalbleDemo r1=new RunnalbleDemo("Thread1-1");
		r1.start();
		RunnalbleDemo r2=new RunnalbleDemo("Thread1-2");
		r2.start();
	}
}