package day12;

import java.util.Scanner;

class Reserve implements Runnable{
	int available =5;
	int wanted;
	
	Reserve(int i){
		wanted = i;
	}//end of Reserve constructor
	
	@Override
	public void run() {
		synchronized (this) {
			//get the name of the passenger
				String name = Thread.currentThread().getName();
			/*
			 * Scanner sc = new Scanner(System.in);
			 * System.out.println("Enter how many berths you need for "+name);
			 * System.out.println("available berths: "+available); wanted = sc.nextInt();
			 */
			 
			
				if(available>=wanted) {
				 if(name.equals("Karthik")) { 
					 wanted = 3;
					 }//end of if(name) 
				 else { 
					 wanted =2; 
					 }//end of else if
					try {
						System.out.println(wanted+" Berths reserved for "+name);
						//allocate the berth for him
						available = available - wanted;
						Thread.sleep(1000);
					} catch (InterruptedException ie) {
						
					}//end of catch
				}//end of if
				else 
					{
					System.out.println("Sorry.. no berth available for " + name);
					System.out.println(available);
					
					}//end of else
				}//end of 
		}//end of run synchronized
	
	 
	
	
}//end of Reserve class


public class ReservationSynchronize {

	
	public static void main(String args[]) {
		Reserve r = new Reserve(2); // uses 2 berth at one time
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		
		t1.setName("Razli");
		t2.setName("Sulianto");
		t3.setName("Karthik");
		
			t1.start();
			
			try {
				t2.join();
				
				
			} catch (Exception e) {
				System.out.println(e);
			
			}
			t2.start();
			t3.start();
			
			
		
		
		
	}
	
}//end of reservation
