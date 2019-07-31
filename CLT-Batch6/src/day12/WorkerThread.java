package day12;

public class WorkerThread implements Runnable {

	String name;
	
	public WorkerThread(String string) {
		name = string;
	}

	@Override
	public void run() {
		System.out.println(name);
		
	}

}
