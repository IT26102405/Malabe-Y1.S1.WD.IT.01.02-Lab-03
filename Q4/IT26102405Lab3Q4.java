import java.util.Scanner;
public class IT26102405Lab3Q4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a five-digit number: ");
		int fiveDigits = input.nextInt();
		int remainder = 0;
		
		int digitOne = fiveDigits / 10000;
		remainder = fiveDigits % 10000;
		
		int digitTwo = remainder / 1000;
		remainder = remainder % 1000;
		
		int digitThree = remainder / 100;
		remainder = remainder % 100;
		
		int digitFour = remainder / 10;
		remainder = remainder % 10;
		
		int digitFive = remainder / 1;
		remainder = remainder % 1;
		
		System.out.println();
		System.out.println(digitOne + " " + digitTwo + " " + digitThree + " " + digitFour + " " + digitFive);
		
		
	}
}