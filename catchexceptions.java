package finalexam;
import java.util.Scanner;

public class catchexceptions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input the first number");
		int numberX = in.nextInt();
		System.out.print("Input the second number");
		int numberY = in.nextInt();
		
		if (numberX >= 0) {
			System.out.println("Invalid number, please use a whole number");
			
			System.out.println(numberX / numberY);
		}

	}

}


