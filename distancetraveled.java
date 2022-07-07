import java.util.Scanner;

public class distancetraveled {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		double vehicleSpeed;
		int    commuteTime;
		double distanceTraveled;
		
		System.out.println("Please enter the speed in mph");
		vehicleSpeed = scanner.nextDouble();
		
		System.out.println("Please enter number of hours traveled");
		commuteTime = scanner.nextInt();
		
		for( int hour = 1; hour <= commuteTime; hour++) {
			distanceTraveled = ( hour * vehicleSpeed );
			System.out.println( hour +"\t" + distanceTraveled );
	
				
		
	}

}
}
