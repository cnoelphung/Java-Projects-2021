package finalexam;
import java.util.Scanner;

public class catchexceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input the first number");
        int numberX = in.nextInt();
        System.out.print("Input the second number");
        int numberY = in.nextInt();
        
        int remainder = 0;
        boolean repeat = true;
        
        while (repeat) {
            try {
                remainder = numberX % numberY;
                repeat = false;
            }
            catch (Exception e) {
                System.out.println("Invalid number, please enter new numbers");
                numberX = in.nextInt();
                numberY = in.nextInt();
                remainder = 0;
            }
        }
        
        System.out.println(remainder); // or return remainder;
        
    }
}