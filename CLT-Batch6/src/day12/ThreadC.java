package day12;

class Sample implements Runnable{

	
	
	  @Override public void run() {
	  System.out.println("Task three from Sample class");
	  play();
	  }
	  
	  void play() {
		  System.out.println("Cricket");
	  }
	 
	
	
}//end of Sample

public class ThreadC {
	public static void main(String args[]) {
		
		  Runnable r1= new Runnable() {// anonymous approach
		 
		  @Override public void run() { 
			  System.out.println("Task one");	 
		  } 
		  };//end of anonymous
		  
		  Runnable r2 = new Runnable() {
		 
		  @Override public void run() { 
			  System.out.println("Task two");
		  } 
		  };//end of anonymous
		 
		  Thread t1 = new Thread(r1);
		  Thread t2 = new Thread(r2);
		  
		  Sample s = new Sample(); 
		  Thread t3 = new Thread(s);
		 
		  t1.start();
		  t2.start();
		  t3.start();
		 
		
		
		
		
	}

}
