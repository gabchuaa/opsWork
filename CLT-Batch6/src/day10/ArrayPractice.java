package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class UserScore{
	String answer;
	int score;
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "UserScore [answer=" + answer + ", score=" + score + "]";
	}
	
	
}

class UserQuestion{
	
	void addScore(UserScore userRef){
		int num = 1;
		num += userRef.getScore();
		userRef.setScore(num);
	}
	
	public void Q1(UserScore userRef) {
		
		System.out.println("What is food? "+ "\n" + "1. Bank"+ "\n" + "2. Singapore"+ "\n" + "3. Burger"+ "\n" + "4. Shoe");
		Scanner in = new Scanner(System.in);
		int ans = in.nextInt();

		if(ans==3) {
		System.out.println("Correct");
		addScore(userRef);
		System.out.println("Points : " +userRef.getScore());
		}
		else {
			System.out.println("Wrong Answer");
		}
		Q2(userRef);
	}
	
public void Q2(UserScore userRef) {
		
	System.out.println("What is a country? "+ "\n" + "a. Moon"+ "\n" + "b. Singapore"+ "\n" + "c. BurgerKing"+ "\n" + "d. Shoe");
	Scanner in = new Scanner(System.in);
	String ans = in.next();

	if(ans.equals("b") || ans.equals("B")) {
		System.out.println("Correct");
		addScore(userRef);
		System.out.println("Points : " +userRef.getScore());
		}
		else {
			System.out.println("Wrong Answer");
		}
		Q3(userRef);
	}

public void Q3(UserScore userRef) {
	
	System.out.println("What is programming Language ? "+ "\n" + "1. Java"+ "\n" + "2. English"+ "\n" + "3. Japanese"+ "\n" + "4. Hokkien");
	Scanner in = new Scanner(System.in);
	int ans = in.nextInt();

		if(ans==1) {
		System.out.println("Correct");
		addScore(userRef);
		System.out.println("Points : " +userRef.getScore());
		}
		else {
			System.out.println("Wrong Answer");
		}
	}
		
}

public class ArrayPractice {

	public static void main(String []args) {
		UserScore refUserScore = new UserScore();
		UserQuestion refUserQuestion = new UserQuestion();
		refUserQuestion.Q1(refUserScore);
		
	}
	
}
