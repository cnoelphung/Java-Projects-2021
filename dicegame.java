import java.util.Random;
public class dicegame {

	public static void main(String[] args) {
		Random random = new Random();
		int totalTurns = 10;
		int dice;
		int computerScore = 0;
		int userScore = 0;
		int userDice = 0;
		int computerDice = 0;
		
		for( int turn = 1; turn <= totalTurns; turn++ ) {
			dice = random.nextInt( 6 ) + 1;
			userDice = random.nextInt( 6 ) + 1;
			
			if( dice > userDice ) {
				computerScore = computerScore + 1;
				System.out.println( "Computer won " + turn );
			} else if( userDice > computerDice ) {
				System.out.println( "User won " + turn );
				userScore = userScore + 1;
			} else {
				System.out.println( "Turn " + turn + " ended in a tie" );
				
			if( computerScore > userScore ) {
				System.out.println( "Computer was the grand winner");
			} else if( userScore > computerScore ) {
				System.out.println( "User was the grand winner");
			} else if( userScore == computerScore ) {
				System.out.println( "It was tie, both players are ggrand winners");
			}
			}
	}

}
}