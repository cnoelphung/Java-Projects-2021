import java.util.Scanner;

public class IngredientAdjuster {

	public static void main(String[] args) {
		
		// create a scanner object
		Scanner scanner = new Scanner( System.in );
		
		// Declare variables
		double cupsOfSugarPer48Cookies = 1.5;
		double cupsOfButterPer48Cookies = 1;
		double cupsOfFlourPer48Cookies = 2.75;
		int regularBatchOfCookies = 48;
		int userNumberOfCookies;
		
		double expectedCupsOfSugar;
		double expectedCupsOfButter;
		double expectedCupsOfFlour;
		
		System.out.println( "Please enter the number of cookies" );
		userNumberOfCookies = scanner.nextInt();
		
		expectedCupsOfSugar = ( userNumberOfCookies / regularBatchOfCookies ) * cupsOfSugarPer48Cookies;
		expectedCupsOfButter = ( userNumberOfCookies / regularBatchOfCookies ) * cupsOfButterPer48Cookies;
		expectedCupsOfFlour = ( userNumberOfCookies / regularBatchOfCookies ) * cupsOfFlourPer48Cookies;
		
		// Display Information
		System.out.println( "For " + regularBatchOfCookies + " cookies, you will need " + expectedCupsOfSugar + " cups of sugar, " +
				           expectedCupsOfButter + " cups of butter and " + expectedCupsOfFlour + " cups of flour.");

	}

}
