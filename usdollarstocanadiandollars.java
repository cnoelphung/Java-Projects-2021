package chapter07;
import java.util.Scanner;

public class usdollarstocanadiandollars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate");
		double rate = input.nextDouble();
		
		System.out.print("Enter 0 to convert U.S Dollars to Canadian Dollars, or Enter 1 to Convert Canadian Dollars to U.S Dollars.");
		int option = input.nextInt();
		
		double total;
		switch(option) 
		{
		case 0: System.out.print("Enter U.S Dollar total: ");
			total = input.nextDouble();
			System.out.println("$" + total + " is " + (total * rate) + " Canadian Dollar"); break;
		
		case 1: System.out.print("Enter the RMB amount: ");;
			total = input.nextDouble();
			System.out.println(total + " Canadian Dollar amounts to" + ((int)((total * 100) / rate)) / 100.0); break;
		
		default: System.out.println("Incorrect input");
		}
		

	}

}
