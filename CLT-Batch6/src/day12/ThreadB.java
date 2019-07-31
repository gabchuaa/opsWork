package day12;

public class ThreadB extends Thread {

	@Override
	public void run() {
		for(int i =1; i<=3;i++) {
			try {
				Thread.sleep(10000); //millisecond
			}
			catch (Exception e) {
				System.out.println(e);
				
			}
			System.out.println(i);
			System.out.println(currentThread().getName());
		}
		
	}
	
	public static void main(String []args) {
		
		ThreadB tb = new ThreadB();
		
		Thread t1 = new Thread(tb);
		Thread t2 = new Thread(tb);
		Thread t3 = new Thread(tb);
		Thread t4 = new Thread(tb);
		Thread t5 = new Thread(tb);
		
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		t4.setName("thread 4");
		t5.setName("thread 5");
		t1.start();
		
		t2.start();
		t3.start();
		try {
			t3.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
		t4.start();
		
		t5.start();
		
		
		
	}
	
	

}
