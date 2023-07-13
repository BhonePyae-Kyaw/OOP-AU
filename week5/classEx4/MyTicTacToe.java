package classEx4;
import java.util.Scanner;

public class MyTicTacToe {
	public static boolean isFull(char[][] tttBoard) {
		for (int i =0; i< tttBoard.length; i++) {
			for (int j = 0; j < tttBoard[i].length; j++) {
				if(tttBoard[i][j]== '\u0000') {
					return false;
				}
			}
		}
		return true;
	}
	public static char whoWin(char [][] tttBoard) {
		for (int row = 0; row < tttBoard.length; row++) {
			if ((tttBoard[row][0] == 'X') && (tttBoard[row][1] == 'X') && (tttBoard[row][2] == 'X')) {
				return 'X';
			}
			if ((tttBoard[row][0] == 'O') && (tttBoard[row][1] == 'O') && (tttBoard[row][2] == 'O')) {
				return 'O';
			}
		}

	    for (int col = 0; col < tttBoard[0].length; col++) {
	    	if (tttBoard[0][col] == 'X' && tttBoard[1][col] == 'X' && tttBoard[2][col] == 'X') {
	    		return 'X';
			}
	    	if (tttBoard[0][col] == 'O' && tttBoard[1][col] == 'Y' && tttBoard[2][col] == 'O') {
	    		return 'O';
			}
	    }

	    if (tttBoard[0][0] == 'X' && tttBoard[1][1] == 'X' && tttBoard[2][2] == 'X') {
	    	return 'X';
	    }
	    
	    if (tttBoard[0][0] == 'O' && tttBoard[1][1] == 'O' && tttBoard[2][2] == 'O') {
	    	return 'O';
		}
	    
	    if (tttBoard[0][2] == 'X' && tttBoard[1][1] == 'X' && tttBoard[2][0] == 'X') {
	    	return 'X';
		    }

	    if (tttBoard[0][2] == 'O' && tttBoard[1][1] == 'O' && tttBoard[2][0] == 'O') {
	    	return 'O';
	    }
		return 'N';
	}
	public static void updateXinput(char [] [] board, Scanner xInput) { 
		System.out.println("Player X turn: ");
		System.out.print("Enter the row number for your move(0 to 2): ");
		int xRow = xInput.nextInt();
		System.out.print("Enter the coulmn number for your move(0 to 2): ");
		int xCol = xInput.nextInt();
		if (board[xRow][xCol] != 'X' && board[xRow][xCol] != 'O') {
			board[xRow][xCol] = 'X';
		}
		else {
			System.out.println("Invalid move. Already ocuupied.");
			updateXinput(board, xInput);
		}
		displayBoard(board);
	}
	public static void updateOinput(char [] [] board, Scanner oInput) { 
		System.out.println("Player O turn: ");
		System.out.print("Enter the row number for your move (0 to 2): ");
		int oRow = oInput.nextInt();
		System.out.print("Enter the coulmn number for your move (0 to 2): ");
		int oCol = oInput.nextInt();
		if (board[oRow][oCol] != 'X' && board[oRow][oCol] != 'O') {
			board[oRow][oCol] = 'O';
		}
		else {
			System.out.println("Invalid move. Already ocuupied.");
			updateOinput(board, oInput);
		}
		displayBoard(board);
	}
	public static void displayBoard(char [] [] board) {
		System.out.println("_ _ _");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j ++) {
				System.out.print(board[i][j]);
				System.out.print('|');
			}
			System.out.println();
			System.out.println("_|_|_|");
		}
	}
public static void main(String[] args) {
		System.out.println("Welcome to TicTacToe game: ");
		char [][] board = new char [3] [3];
		displayBoard(board);
		while(true) {
			Scanner userInput = new Scanner(System.in);
			updateXinput(board,userInput);
			if (whoWin(board) == 'X' || whoWin(board) == 'O') {
				System.out.print(whoWin(board) + " has won.");
				break;
			}
			if (isFull(board)) {
				break;
			}
			updateOinput(board,userInput);
			if (whoWin(board) == 'X' || whoWin(board) == 'O') {
				System.out.print(whoWin(board) + " has won.");
				break;
			}
		}
		
		if (isFull(board)) {
			if (whoWin(board) == 'N') {
				System.out.print("There is no winner.");
			}
		}
	}
}
