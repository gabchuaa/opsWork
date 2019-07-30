
package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Question{
	String question;
	String answer;
	
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return question+""+answer;
	}
	
	
	
}

public class HashMapPratice {

	public static void main(String []args) {
		Map<String,String> refMap = new HashMap<String,String>();
		Scanner sc = new Scanner(System.in);
		int score = 0;
		//Question q1 = new Question("What is TDD","\na)Test Driven Development \tb)Throw Data Development \nc)Test Data Development \td)Take Driven Development");
//		refMap.put(new Question("What is TDD","\na)Test Driven Development \tb)Throw Data Development \nc)Test Data Development \td)Take Driven Development"), "1");
//		refMap.put(new Question("Which is not agile 12 principle","\na)Satisfy the Customer \t\tb)Welcome Change \nc)Reflect for Effectiveness \td)Keep it messy"), "2");
//		refMap.put(new Question("Which is not Solid Principle","\na)Single responsibility principle \tb)Liskov substitution principle"
//								+ " \nc)Not Dependency inversion principle \td)Interface segregation principle"), "3"); 
//		
		refMap.put("What is TDD"+"\na)Test Driven Development \tb)Throw Data Development \nc)Test Data Development \td)Take Driven Development" ,"a");
		refMap.put("Which is not agile 12 principle"+"\na)Satisfy the Customer \t\tb)Welcome Change \nc)Reflect for Effectiveness \td)Keep it messy","d");
		refMap.put("Which is not Solid Principle"+"\na)Single responsibility principle \tb)Liskov substitution principle"
		+ " \nc)Not Dependency inversion principle \td)Interface segregation principle","c");
		
		HashMap <String,String> answer = new HashMap<String,String>();
		
		for(String temp: refMap.keySet()) {
			System.out.println(temp);
			String input = sc.next();
			answer.put(temp, input);
			if(refMap.get(temp).equals(input)) {
				System.out.println(score);
				score++;
			} else {
				System.out.println("Wrong");
			}
		}
				
		
		
		
		}
		
	}
	

