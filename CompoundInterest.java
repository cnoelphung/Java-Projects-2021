import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
	double r,P,A;
	int n,t;
		
	Scanner scanner = new Scanner(System.in);
    
	System.out.println("Amount originally in account");
	P= scanner.nextDouble();
	
	System.out.println("interest rate:");
	r= (double) scanner.nextInt()/100;
	
	System.out.println("years");
	t= scanner.nextInt();
	
	System.out.println("number of times compounded a year ");
	n= scanner.nextInt();
	
	A=P*Math.pow((1+(r/n)),(n*t));
	
	System.out.println("the final amount of money in the account will be: "+A);
	}

}
