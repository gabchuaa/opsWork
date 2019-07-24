package day08;

class DevCode1{
	static String abc;
	
	
	
	
}

public class DevCode {

	static void login(int number) {
		try {
			/*
			 * int temp = number/0; System.out.println(temp);
			 */
			/*
			 * int a[] = {10,20,30,40,50}; a[50] = 5000; System.out.println(a[50]);
			 */
			
			Object ref = null;
			
			
			System.out.println(ref.toString());
			
		} catch (ArithmeticException e) {
			System.out.println("A number can't be divisible by 0.");
		}
		catch(NullPointerException e) {
			System.out.println("Handle NullPointerException");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handle ArrayIndexOutOfBoundsException.....");
		}
		
		catch (Exception e) {// avoid writing exception at the begining. Write at the end
			System.out.println("Exception in the super class of all Exception Classes");
		}
		
		finally {
			System.out.println("Closing file");
		}
	}
}
