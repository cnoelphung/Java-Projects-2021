package finalexam;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class babynameranking {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter gender");
		String gender = input.next();
		
		System.out.print("Enter Name");
		String name = input.next();
		input.close();
		
		File file = new File("Babynameranking2020.txt");
		
		
		
	int ranking = 0;
			
			try { 
				Scanner read = new Scanner(file);
				while (read.hasNext()) {
					
					String babyname = read.nextLine();
					String[] temp = babyname.split(" ");
					
					if (gender.equalsIgnoreCase("M") && temp[1].contains(name))
						ranking = new Integer(temp[0]);
					
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
				System.out.println("The name" + name + "is ranked" + ranking + "in 2020");
			

	}

}

}



