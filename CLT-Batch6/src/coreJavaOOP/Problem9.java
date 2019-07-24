package coreJavaOOP;

import java.util.Arrays;

public class Problem9 {
	
	
	public static void main(String []args) {
		String[] values = {"AB","BC","CD","AE"};
		boolean contains = Arrays.stream(values).anyMatch("s"::equals);
		System.out.println(contains);
	}
}
