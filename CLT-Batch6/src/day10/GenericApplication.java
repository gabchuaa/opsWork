package day10;

class Person{

	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}

//List <T> interface
interface Book<Programming>{//Java is a Type of Book
	void showDetails(Programming pRef);
}

class CoreJava<Java > implements Book<Java>{ //ArrayList<T> implements List<T>

	@Override
	public void showDetails(Java jRef) {// void add <R rRef> 
		
		System.out.println(jRef);
		
	}//end of showDetails
	
}// end of CoreJava

public class GenericApplication {
	
	public static void main(String []args) {
		//int price = 50;
		
		Integer price = 60;//Wrapper class
		CoreJava<Integer> ref1 = new CoreJava<Integer>();
		ref1.showDetails(price);
		
		String name = "Complete Reference"; // Java API defined class
		CoreJava <String> ref2 = new CoreJava<String>();
		ref2.showDetails(name);
		
		Person pRef = new Person();
		pRef.setName("Gary");
		CoreJava<Person> ref3 = new CoreJava<Person>();
		
		ref3.showDetails(pRef);
		
		
		
	}

}
