package multithreadingExamples;

class MyThread1 implements Runnable{
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Boy is walking...!");
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class MyThread2 implements Runnable{
	
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Boy is Running...!");
			
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class RunnableDemo {

	public static void main(String[] args) {
		/*
		 * when we implement runnable interface then we will inherit only the run method.
		 * since start methods thread class method our class will not inherit this method.
		 * so we make thread class object and pass our class reference in its constructor
		 * hence the start method of Thread class will call run method of our class.
		 * 
		 * while making thread it's said that implementing runnable interface is much better
		 * than extending thread class.
		 * Reasons:-
		 * 1] we do not make our class unnecessarily bulky when we implement runnable
		 * 2] Since multiple inheritance is not allowed in java in case we extend thread 
		 * class then we will not be able to extend any other class. Hence implementing
		 * runnable would be better 
		 */
		MyThread1 mt1=new MyThread1();
		MyThread2 mt2=new MyThread2();
		
		Thread thread1=new Thread(mt1);
		Thread thread2=new Thread(mt1);
		
		thread1.start();
		thread2.start();
		
	}

}
