package day2;
import java.util.*;
public class Arithmatic {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Choose an operation:");
	        System.out.println("1. Addition (+)");
	        System.out.println("2. Subtraction (-)");
	        System.out.println("3. Multiplication (*)");
	        System.out.println("4. Division (/)");

	        int choice = scanner.nextInt();

	        double result;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Addition: " + num1 + " + " + num2 + " = " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + result);
	                break;
	            case 3:
	                result = num1 * num2;
	                System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + result);
	                break;
	            case 4:
	                if (num2 == 0) {
	                    System.out.println("Error: Division by zero");
	                } else {
	                    result = num1 / num2;
	                    System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
	                }
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        scanner.close();
	    }
	

	
		

	}




       