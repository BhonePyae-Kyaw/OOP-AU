package classEx5;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleDiceGame {
	
	public static Dice dice = new Dice(1);
	
	public static boolean checkDices(int[] dices) {
		int [] test1 = {1,4,6};
		int [] test2 = {1,6,4};
		int [] test3 = {4,1,6};
		int [] test4 = {4,6,1};
		int [] test5 = {6,1,4};
		int [] test6 = {6,4,1};
		if ((Arrays.equals(dices, test1)) || (Arrays.equals(dices, test2)) || (Arrays.equals(dices, test3)) ||
			(Arrays.equals(dices, test4)) || (Arrays.equals(dices, test5)) || (Arrays.equals(dices, test6)) ) {
			return true;
		}
		return false;
	}
	
	public static int [] playerRollDice(int [] playerDices, Scanner userRoll,String player) {
		System.out.println();
		System.out.println(player + " turn.");
		System.out.print("Type \'r' then press enter to roll the dice: ");
		String enterR = userRoll.next();
		for (int i=0; i < playerDices.length; i++) {
			playerDices[i] = dice.rollDice();
		}
		System.out.println(player +" dices are " + Arrays.toString(playerDices) + "." );
		return playerDices;
	}
	
	public static void main(String[] args) {
		System.out.println("#######GAME RULE########");
		System.out.println("The game will be won if one of the two players get 3 dices with number 1, 4, and 6.");
		System.out.println("The game will continue untill one player wins.");
		System.out.println("########################");
		int [] playerDices = new int [3];
		String player1 = "Player 1";
		String player2 = "Player 2";
		Scanner userRoll = new Scanner(System.in);
		while (true) {
			if (checkDices(playerRollDice(playerDices, userRoll, player1))) {
				System.out.println("Congratulations! Player 1 wins.");
				break;
			}else {
				System.out.print("Good Luck next time.");
				System.out.println();
			}
			
			if (checkDices(playerRollDice(playerDices,userRoll,player2))) {
				System.out.println("Congratulations! Player 2 wins.");
				break;
			}else {
				System.out.print("Good Luck next time.");
				System.out.println();
			}
		}
	}

}
