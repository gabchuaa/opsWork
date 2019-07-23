package day07;

public class StringClassExample {
	
	String ref1 = "Python";
	String ref2 = "Python";
	
	String ref3 = new String("Scale");
	String ref4 = new String("Scale");
	
	Person ref5 = new Person("Java");
	Person ref6 = new Person("Java");
	
	//scenario1 won't work on 
//	void scenario1() {
//		if(ref3 == ref4) {
//			System.out.println("same");
//		} else {
//			System.out.println("not same");
//		}
//	}// end of scenario1
	
	void scenario2() {
		if(ref5.equals(ref6)) {
			System.out.println(ref5.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("same");
		} else {
			System.out.println(ref5.hashCode());
			System.out.println(ref6.hashCode());
			System.out.println("not same");
		}
	}
	
	public static void main(String[]args) {
		StringClassExample refStringClassExample = new StringClassExample();
		//refStringClassExample.scenario1();
		refStringClassExample.scenario2();
	}

}
