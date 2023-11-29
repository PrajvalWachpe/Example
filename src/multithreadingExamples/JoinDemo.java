package multithreadingExamples;

class Table extends Thread{
	
	int num;
	
	public Table(int num) {
		super();
		this.num=num;
	}
	
	public void run() {
		for (int i=1; i<=10; i++) {
			System.out.println(num+ " x "+i+"= "+(num*i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class JoinDemo {

	public static void main(String[] args) {
		
		Table t=new Table(2);
		Table t1=new Table(3);
		Table t2=new Table(4);
		
		System.out.println("Table Of 2");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\nTable Of 3");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\nTable Of 4");
		t2.start();
	}

}
