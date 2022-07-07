import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		
		// Ask user to input their weight, and height
		System.out.println("Please enter your weight.");
		double weight = sc.nextDouble();
		
		System.out.println("Please enter your height.");
		double height = sc.nextDouble();
		double bmi = ( weight * 703 ) / ( height * height );
		
		// Calculate whether user is under, optimal, or over.
		if( bmi < 18.5 ) {
			
			System.out.print( "You are underweight" );
		
		} else if( bmi < 25 ) {
			
			System.out.print( "You are the optimal weight" );
		
		} else if( bmi > 25 )
			System.out.print( "You are overweight" );
		
		
			
			
		
		}
}
		


