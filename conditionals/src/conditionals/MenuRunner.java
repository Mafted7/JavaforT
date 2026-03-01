package conditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Number1: ");
		int number1 = scanner.nextInt();		
		
		System.out.print("Enter Number2: ");
		int number2 = scanner.nextInt();	
		
		System.out.println("These are the choices available");
		System.out.println("1: Add");
		System.out.println("2: Subtract");
		System.out.println("3: Multiply");
		System.out.println("4: Divide");
		
		
		System.out.print("Enter choice: ");
		int choice = scanner.nextInt();	
		
		System.out.println("Number 1: " + number1);
		System.out.println("Number 2: " + number2);
		System.out.println("choice: " + choice);
		
		performOperationsUsingNestedIfElse(number1, number2, choice);
		
			

	}

	private static void performOperationsUsingNestedIfElse(int number1, int number2, int choice) {
		if(choice == 1) {
			System.out.println("Reuslt: " + (number1 + number2));
		}else if(choice == 2) {
			System.out.println("Result: "  + (number1 - number2));
		}else if(choice == 3) {
			System.out.println("Result: "  + (number1 * number2));
		}else if(choice == 4) {
			System.out.println("Result: "  + (number1 / number2));
		}else {
			System.out.println("Invalid Operation");
		}
	}

}
