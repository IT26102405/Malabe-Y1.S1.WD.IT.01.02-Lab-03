import java.util.Scanner;
public class IT26102405Lab3Q1B {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		double priceRice = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		double riceAmt = input.nextDouble();
		
		double riceTotal = riceAmt * priceRice * 0.9;
		System.out.println();
		System.out.println("The total amount with 10% discount is: " + riceTotal);
	}
}