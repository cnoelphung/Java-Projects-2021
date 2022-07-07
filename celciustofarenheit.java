import java.util.Scanner;

public class celciustofarenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double fahrenheitTemperature;
		
		System.out.println( "Celsius Temperature\tFahrenheit Temperature\n-----\t---------" );
		for( double celsiusTemperature = 0; celsiusTemperature <= 20; celsiusTemperature++ ) {
			fahrenheitTemperature = ( ( 9 / 5 ) * celsiusTemperature ) + 32;
			System.out.printf( "%f\t%f\n" , celsiusTemperature, fahrenheitTemperature );
			
		}
		
		
		

	}

}
