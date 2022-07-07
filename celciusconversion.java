
public class celciusconversion {

	public static double celcius( double fahrenheitTemperature ) {
		double celcius;
		celcius = ( 5 / 9 ) * ( fahrenheitTemperature - 32 );
		return celcius;

	}
	public static void displayHeader() {
		System.out.println( "Fahrenheit temperature\t\t\tCelcius\n--------\t\t\t----------\n" );
		
	}
public static void main( String [ ] args ) {
	displayHeader();
	double celcius;
	celcius = ( 5 / 9 ) * ( fahrenheitTemperature - 32 );
	for( double currentFahrenheitTemperature = 0; currentFahrenheitTemperature <= 20; currentFahrenheitTemperature++  ) {
		System.out.println( currentFahrenheitTemperature + "\t\t\t\t" + celcius);
	}
}

}
