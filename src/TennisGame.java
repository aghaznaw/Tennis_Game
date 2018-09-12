import java.util.Scanner;

public class TennisGame {
	
	private int p1;
	private int p2;
	private int scoreFlagP1;
	private int scoreFlagP2;
	
	public TennisGame() {
		// TO BE IMPLEMENTED
		System.out.println("I am constructor");
		
		
	}

	public void  getScore() {
		System.out.println("I am method for displaying score");
			
		while(this.getWiner() == "") {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the score for P1");
		    int score = input.nextInt();
			
			if(score != 0) {
				p1 = p1 + score;
				scoreFlagP1 += 1;
				
			}else{
				p2 = p2 + 15;
				scoreFlagP2 += 1;
			}
		
			System.out.println("The winer: " + getWiner());
		
			System.out.println("p1 - p2");
			System.out.println(p1 + " - " + p2);
			
			// Here is the format of the scores: "player1Score - player2Score"
			// "0 - 0"
			// "15 - 15"
			// "30 - 30"
			// "deuce"
			// "15 - 0", "0 - 15"
			// "30 - 0", "0 - 30"
			// "40 - 0", "0 - 40"
			// "30 - 15", "15 - 30"
			// "40 - 15", "15 - 40"
			// "advantage player1"
			// "advantage player2"
			// "game player1"
			// "game player2"
	
			// TO BE IMPLEMENTED
		}
	}
	
	private String getWiner() {
		
		String winer = "";
		if(scoreFlagP1 < scoreFlagP2 + 2 ) {
			winer ="P1";
		}
		
		if(scoreFlagP2 < scoreFlagP1 + 2) {
			winer = "P2";
		}
		
		return winer;
	}
	
	private boolean isDeuce() {
		
		boolean deuce = false;
		if(scoreFlagP1 == 3 && scoreFlagP2 == 3) {
			deuce = true;
		}
		return deuce;
	}
}
