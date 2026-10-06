import java.util.Scanner;
public class IT26102405Lab3Q2 {

	public static void main(String[] args) {
	
		double monthlySal, otHrs, otHourlyRate, totalSal;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary: ");
		monthlySal = input.nextDouble();
		
		System.out.print("Enter the number of OT hours: ");
		otHrs = input.nextDouble();
		
		System.out.print("Enter the OT hourly rate: ");
		otHourlyRate = input.nextDouble();
		
		totalSal = monthlySal + (otHrs * otHourlyRate);
		System.out.println();
		System.out.println("The total salary including OT is: " + totalSal);
	}
}