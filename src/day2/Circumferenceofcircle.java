package day2;
import java.util.Scanner;
public class Circumferenceofcircle {

	public static void main(String[] args) {
		

		
		    
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the radius of the circle: ");
		        double radius = scanner.nextDouble();

		        double circumference = 2 * Math.PI * radius;

		        System.out.println("The circumference of the circle is: " + circumference);

		        scanner.close();
		    }
		

	}


