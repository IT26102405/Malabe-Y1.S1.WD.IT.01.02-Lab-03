import java.util.Scanner;
public class IT26102405Lab3Q4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a five-digit number: ");
		int fiveDigits = input.nextInt();
		int runningDigit = 0;
		
		int digitOne = fiveDigits / 10000;
		runningDigit = fiveDigits % 10000;
		
		int digitTwo = runningDigit / 1000;
		runningDigit = runningDigit % 1000;
		
		int digitThree = runningDigit / 100;
		runningDigit = runningDigit % 100;
		
		int digitFour = runningDigit / 10;
		runningDigit = runningDigit % 10;
		
		int digitFive = runningDigit / 1;
		runningDigit = runningDigit % 1;
		
		System.out.println();
		System.out.println(digitOne + " " + digitTwo + " " + digitThree + " " + digitFour + " " + digitFive);
		
		
	}
}