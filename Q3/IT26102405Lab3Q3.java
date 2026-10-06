import java.util.Scanner;
public class IT26102405Lab3Q3 {

	public static void main(String[] args) {
	
		int fiveK_note, oneK_note, fiveHundred, twoHundred, oneHundred, fifty, twenty, ten, five, two, one;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Rupee amount: ");
		int rupeeAmt = input.nextInt();
		
		fiveK_note = rupeeAmt / 5000;
		rupeeAmt = rupeeAmt - fiveK_note * 5000;
		
		oneK_note = rupeeAmt / 1000;
		rupeeAmt = rupeeAmt - oneK_note * 1000;
		
		fiveHundred = rupeeAmt / 500;
		rupeeAmt = rupeeAmt - fiveHundred * 500;
		
		twoHundred = rupeeAmt / 200;
		rupeeAmt = rupeeAmt - twoHundred * 200;
		
		oneHundred = rupeeAmt / 100;
		rupeeAmt = rupeeAmt - oneHundred * 100;
		
		fifty = rupeeAmt / 50;
		rupeeAmt = rupeeAmt - fifty * 50;
		
		twenty = rupeeAmt / 20;
		rupeeAmt = rupeeAmt - twenty * 20;
		
		ten = rupeeAmt / 10;
		rupeeAmt = rupeeAmt - ten * 10;
		
		five = rupeeAmt / 5;
		rupeeAmt = rupeeAmt - five * 5;
		
		two = rupeeAmt / 2;
		rupeeAmt = rupeeAmt - two * 2;
		
		one = rupeeAmt / 1;
		rupeeAmt = rupeeAmt - one * 1;
		
		System.out.println("5000 Notes - " + fiveK_note);
		System.out.println("1000 Notes - " + oneK_note);
		System.out.println("500 Notes - " + fiveHundred);
		System.out.println("200 Notes - " + twoHundred);
		System.out.println("100 Notes - " + oneHundred);
		System.out.println("50 Notes - " + fifty);
		System.out.println("20 Notes - " + twenty);
		System.out.println("10 Coins - " + ten);
		System.out.println("05 Coins - " + five);
		System.out.println("02 Coins - " + two);
		System.out.println("01 Coins - " + one);
		
	}
}