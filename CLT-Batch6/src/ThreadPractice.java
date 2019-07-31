import java.util.Scanner;
class Halls implements Runnable{
	int ticket = 15;
	int wanted ;
	
	Halls(int i){
		wanted = i;
	}
	
	@Override
	public void run() {
		
		
		String name = Thread.currentThread().getName();
		synchronized (this) {
			
			
			
			if(ticket >= wanted) {
				try {
				System.out.println(name+" bought "+ wanted);
				System.out.println("=================================");
				ticket = ticket - wanted;
				Thread.sleep(2100);
				}
				catch(Exception e) {
					
				}
			} //end of if
			else {
				System.out.println("Sorry "+ name +" not enough ticket for you "+ ticket);
			}
		}
		
		
		
	}
	}

public class ThreadPractice {
	public static void main(String args[]) {
		Halls refHalls  = new Halls(2);
		Halls refHalls1  = new Halls(3);
		Halls refHalls2  = new Halls(4);
		Halls refHalls3  = new Halls(1);
		Halls refHalls4  = new Halls(5);
		
		Thread t1 = new Thread(refHalls);
		Thread t2 = new Thread(refHalls1);
		Thread t3 = new Thread(refHalls2);
		Thread t4 = new Thread(refHalls3);
		Thread t5 = new Thread(refHalls4);
		
		t1.setName("Eclispe");
		t2.setName("Mentos");
		t3.setName("Rico-laaa");
		t4.setName("M & M");
		t5.setName("Tictac");
		
		t1.start();
		t2.start();
		try {
			t3.join();
		} catch (Exception e){
			
		}
		t3.start();
		t4.start();
		t5.start();
	}
		
	}
	
	
	
	


