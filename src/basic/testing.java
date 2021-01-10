package basic;

import java.util.Scanner;

public class testing {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Input first number");
		int firstNumber = input.nextInt();	
			
		System.out.println("Input second number");
		int secondNumber = input.nextInt();
				
		int result=firstNumber*secondNumber;
				
		System.out.println("Expected Output: "+firstNumber+"*"+secondNumber+"="+result);
}
}