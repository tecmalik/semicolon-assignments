import java.util.Scanner;
public class TicTacToe{
	static Scanner input = new Scanner(System.in);
	static String firstPlayer = "x";
	public static void main(String[] args){

		String[] board = {"-","-","-","-","-","-","-","-","-"};
				     

		
		String winner = " ";
		Boolean gameisRunning = true;
		
		
		while(gameisRunning){

			printGameBoard(board);
			playerInput(board);
		}



	}
	public static void printGameBoard(String[] board){

		System.out.printf("%s | %s | %s%n ",board[0],board[1],board[2]);
		System.out.println("---------");
		System.out.printf("%s | %s | %s%n ",board[3],board[4],board[5]);
		System.out.println("---------");
		System.out.printf("%s | %s | %s%n ",board[6],board[7],board[8]);
		
	
	}
	public static void playerInput(String[] board){
		System.out.print("Enter a number 1 - 9 : ");
		int playerInput = input.nextInt();
		if(playerInput >= 1 && playerInput <= 9 && board[playerInput-1] == "-" ){
			board[playerInput-1] = firstPlayer;
		}
		else {
			System.out.print(" Space Occupied ");
		}
		
	}















}