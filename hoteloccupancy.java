import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class hoteloccupancy {

	public static void main(String[] args) {
		int floors;
		double rooms = 0;
		int roomsOccupied = 0;
		double roomsTotal = 0;
		double totalRoomsOccupied = 0;
		double vacancy = 0;
		double occupancyRate = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of floors ");
		floors = input.nextInt();
		
		while(floors < 1) {
			System.out.print("Invalid. enter a number greater than 0");
			floors = input.nextInt();
			
		}
		
		for(int i=0; i<floors; i++) {
			
			System.out.print("Enter the number of rooms (floor " + (int)(i+1) + "): ");
			rooms = input.nextInt();
			while(rooms < 10) {
				System.out.print("Invalid input. Enter a number of rooms greater than 9 \n(Floor " + (int)(i + 1) + "): ");
				rooms = input.nextInt();
				
			}
			
			System.out.print("Enter the number of rooms that are occupied(floor " + (int)(i + 1) + "): ");
			roomsOccupied = input.nextInt();
			
			roomsTotal += rooms;
			
			totalRoomsOccupied += roomsOccupied;
		}
		
		vacancy = roomsTotal - totalRoomsOccupied;
		
		occupancyRate = (totalRoomsOccupied/roomsTotal);
		
		NumberFormat df = DecimalFormat.getInstance();
		df.setMaximumFractionDigits(2);;
		
		System.out.println("Total Rooms: " + roomsTotal + "\nOccupied(QTY): " + totalRoomsOccupied + 
				"\nVacant Rooms(QTY): " + vacancy + "\nOccupancy Rate: " + df.format(occupancyRate) + "%");

	}

}
