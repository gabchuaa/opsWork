package day07;

public class CommandLineArgumentExample {
	
	public static void main(String[]city) {
		
		
		String citiNames[] = city;
		int length = citiNames.length;
		
		/*
		 * for(int i =0; i<length;i++) { System.out.println(citiNames[i]); }
		 */
		
		for (String refCity : city) {
			System.out.println(refCity);
		}
	
	}

}
