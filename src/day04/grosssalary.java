package day04;
import java.util.Scanner;

public class grosssalary {

	public static void main(String[] args) {
	

		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the basic salary: ");
		        double basicSalary = scanner.nextDouble();

		        double bonusPercentage;

		        if (basicSalary <= 10000) {
		            bonusPercentage = 5.0; // 5% bonus for basic salary <= 10000
		        } else if (basicSalary <= 20000) {
		            bonusPercentage = 10.0; // 10% bonus for basic salary <= 20000
		        } else {
		            bonusPercentage = 15.0; // 15% bonus for basic salary > 20000
		        }

		        double bonusAmount = (bonusPercentage / 100) * basicSalary;
		        double grossSalary = basicSalary + bonusAmount;

		        System.out.println("Basic Salary: " + basicSalary);
		        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
		        System.out.println("Bonus Amount: " + bonusAmount);
		        System.out.println("Gross Salary: " + grossSalary);

		        scanner.close();
		    }
		

	}


