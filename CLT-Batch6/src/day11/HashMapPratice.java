
package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Question{
	String question;
	int answer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return question+""+answer;
	}
	
	
	
}

public class HashMapPratice {

	public static void main(String []args) {
		Map<String,Integer> refMap = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		int score = 0;
		//Question q1 = new Question("What is TDD","\na)Test Driven Development \tb)Throw Data Development \nc)Test Data Development \td)Take Driven Development");
//		refMap.put(new Question("What is TDD","\na)Test Driven Development \tb)Throw Data Development \nc)Test Data Development \td)Take Driven Development"), "1");
//		refMap.put(new Question("Which is not agile 12 principle","\na)Satisfy the Customer \t\tb)Welcome Change \nc)Reflect for Effectiveness \td)Keep it messy"), "2");
//		refMap.put(new Question("Which is not Solid Principle","\na)Single responsibility principle \tb)Liskov substitution principle"
//								+ " \nc)Not Dependency inversion principle \td)Interface segregation principle"), "3"); 
//		
		refMap.put("What is TDD"+"\n1)Test Driven Development \t2)Throw Data Development \n3)Test Data Development \t4)Take Driven Development" ,1);
		refMap.put("Which is not agile 12 principle"+"\n1)Satisfy the Customer \t\t2)Welcome Change \n3)Reflect for Effectiveness \t4)Keep it messy",4);
		refMap.put("Which is not Solid Principle"+"\n1)Single responsibility principle \t2)Liskov substitution principle"
		+ " \n3)Not Dependency inversion principle \t4)Interface segregation principle",3);
		
		
		
		for(String temp: refMap.keySet()) {
			System.out.println(temp);
			int input = sc.nextInt();
			if(refMap.containsValue(input)) {
				score++;
				System.out.println(score);
			} else {
				System.out.println("Wrong");
			}
			
		}
				
		System.out.println("Your final score "+score);
		
		
		}
		
	}
	

