package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Question{
	String question;
	String answer;
	
	
	
	public Question(String question, String answer) {
		super();
		this.question = question;
		this.answer = answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public String getQuestion() {
		return question;
	}

	@Override
	public String toString() {
		return question+answer ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answer == null) ? 0 : answer.hashCode());
		result = prime * result + ((question == null) ? 0 : question.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}

	
}

public class ArrayPractice03 {
	
	public static void main (String []args) {
		
		int score = 0;
		Scanner sc = new Scanner(System.in);
		List refList = new ArrayList();
		refList.add(new Question("What is a computer?"," \na) Electronic Device \tb)Food \nc)Map \t\t\td)A plane)"));
		refList.add(new Question("Purpose of ATM machine?"," \na)Online Shopping \tb)To deposit money and withdraw \nc)To send Parcel \td)Play game)"));
		refList.add(new Question("What can Smartphone do?"," \na)To throw at people face \tb)Inhaler \nc)Contacting people \t\td)Use as a fan)"));
		
		Object q1 = refList.get(0);
		Object q2 = refList.get(1);
		Object q3 = refList.get(2);
		
		System.out.println(q1);
		System.out.println("Enter your answer : ");
		String answer = sc.next();
		if(answer.equals("a")) {
			System.out.println("Correct");
			score++;
			System.out.println("Your score now is "+score);
		} else {
			System.out.println("Wrong" + "Score now "+score);
		}
		System.out.println(q2);
		System.out.println("Enter your answer : ");
		answer = sc.next();
		if(answer.equals("b")) {
			System.out.println("Correct");
			score++;
			System.out.println("Your score now is "+score);
		}else {
			System.out.println("Wrong" + "Score now "+score);
		}
		System.out.println(q3);
		System.out.println("Enter your answer : ");
		answer = sc.next();
		if(answer.equals("c")) {
			System.out.println("Correct");
			score++;
			System.out.println("Your score now is "+score);
		}else {
			System.out.println("Wrong" + "Score now "+score);
		}
		
		
		
	}
	

}
