package day12;

import java.util.Scanner;

class Halls implements Runnable{
	int ticket = 15;
	int wanted ;
	@Override
	public void run() {
		
		
		String name = Thread.currentThread().getName();
		Scanner sc = new Scanner(System.in);
		synchronized (this) {
			
			System.out.println("First come first serve!!");
			System.out.println("Remaining ticket "+ticket);
			System.out.println(name+" enter number of ticket you want");
			wanted = sc.nextInt();
			
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
	
	public static void main(String []args) {
		Halls refHalls  = new Halls();
		
		Thread t1 = new Thread(refHalls);
		Thread t2 = new Thread(refHalls);
		Thread t3 = new Thread(refHalls);
		Thread t4 = new Thread(refHalls);
		Thread t5 = new Thread(refHalls);
		
		t1.setName("Eclispe");
		t2.setName("Mentos");
		t3.setName("Rico-laaa");
		t4.setName("M & M");
		t5.setName("Tictac");
		t4.setPriority(10);
		t1.setPriority(1);
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
