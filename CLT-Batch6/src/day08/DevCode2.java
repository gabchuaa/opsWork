package day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DevCode2 {

	// 1. handle NullPointerException(printing null)
	// 2. handle NumberFormatException (BufferedReader)
	// 3. InputMismatchException (Scanner)

	static void logic() throws IOException {

		try {
			Object ref = null;
			System.out.println(ref.toString());
			
			/*
			 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 * System.out.println("Enter number2 : "); int number =
			 * Integer.parseInt(br.readLine()); System.out.println(number);
			 */
			 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number : ");
			int number1	 = sc.nextInt();
			System.out.println(number1);
			
		} catch (NullPointerException e) {
			System.out.println("Handle NullPointerException");
		}
		catch (NumberFormatException e) {
			System.out.println("Handle NumberFormatException");
		} catch (InputMismatchException e) {
			System.out.println("Handle InputMismatchException");
		} 

	}

}
