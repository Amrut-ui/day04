package day04;
import java.util.Scanner;
public class Switchcase {


	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Area of Circle");
	            System.out.println("2. Area of Triangle");
	            System.out.println("3. Circumference of Circle");
	            System.out.println("4. Perimeter of Triangle");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the radius of the circle: ");
	                    double radius = scanner.nextDouble();
	                    double areaOfCircle = Math.PI * radius * radius;
	                    System.out.println("Area of Circle: " + areaOfCircle);
	                    break;
	                case 2:
	                    System.out.print("Enter the base of the triangle: ");
	                    double base = scanner.nextDouble();
	                    System.out.print("Enter the height of the triangle: ");
	                    double height = scanner.nextDouble();
	                    double areaOfTriangle = 0.5 * base * height;
	                    System.out.println("Area of Triangle: " + areaOfTriangle);
	                    break;
	                case 3:
	                    System.out.print("Enter the radius of the circle: ");
	                    radius = scanner.nextDouble();
	                    double circumferenceOfCircle = 2 * Math.PI * radius;
	                    System.out.println("Circumference of Circle: " + circumferenceOfCircle);
	                    break;
	                case 4:
	                    System.out.print("Enter the side1 of the triangle: ");
	                    double side1 = scanner.nextDouble();
	                    System.out.print("Enter the side2 of the triangle: ");
	                    double side2 = scanner.nextDouble();
	                    System.out.print("Enter the side3 of the triangle: ");
	                    double side3 = scanner.nextDouble();
	                    double perimeterOfTriangle = side1 + side2 + side3;
	                    System.out.println("Perimeter of Triangle: " + perimeterOfTriangle);
	                    break;
	                case 5:
	                    System.out.println("Exiting the program.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        scanner.close();
	    
	}

}
