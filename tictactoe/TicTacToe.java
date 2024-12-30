import java.util.Scanner;
public class TicTacToe{
	static Scanner input = new Scanner(System.in);
	static String[] board = {"-","-","-","-","-","-","-","-","-"};
	static String firstPlayer = "x";
	static String winner = " ";
	static Boolean gameisRunning = true;

	public static void main(String[] args){


		
		
		while(gameisRunning){

			printGameBoard(board);
			playerInput(board);
			checkWin();
			checkTie(board);
			switchPlayer();
		}


	}
	public static void printGameBoard(String[] board){

		System.out.printf("%s | %s | %s \n ",board[0],board[1],board[2]);
		System.out.println("---------");
		System.out.printf("%s | %s | %s \n ",board[3],board[4],board[5]);
		System.out.println("---------");
		System.out.printf("%s | %s | %s \n ",board[6],board[7],board[8]);
		
	
	}
	public static void playerInput(String[] board){
		System.out.print("Enter a number 1 - 9 : ");
		int playerInput = input.nextInt();
		if(playerInput >= 1 && playerInput <= 9 && board[playerInput-1] == "-" ){
			board[playerInput-1] = firstPlayer;
		}
		else {
			System.out.println(" Space Occupied ");
		}
		
	}
	
	public static boolean checkHorizontal(String[] board){
		if(board[0] == board[1] && board[0]  == board[2] && board[0] != "-"){
			winner = board[2];
			return true ;
		}
		else if(board[3] == board[4] && board[3]  == board[5] && board[3] != "-"){
			winner = board[2];
			return true ;
		}
		else if(board[6] == board[7] && board[6]  == board[8] && board[6] != "-"){
			winner = board[2];
			return true ;
		}

		return false;
	}


	public static boolean checkvertical(String[] board){
		if(board[0] == board[3] && board[0]  == board[6] && board[0] != "-"){
			winner = board[0];
			return true ;
		}
		else if(board[1] == board[4] && board[1]  == board[7] && board[1] != "-"){
			winner = board[1];
			return true ;
		}
		else if(board[2] == board[5] && board[2]  == board[8] && board[2] != "-"){
			winner = board[2];
			return true ;
		}
		return false;
	}
	
	public static boolean checkDiagonals(String[] board){
	
		if(board[0] == board[4] && board[0]  == board[8] && board[0] != "-"){
			winner = board[0];
			return true ;
		}
		else if(board[2] == board[4] && board[1]  == board[7] && board[1] != "-"){
			winner = board[2];
			return true ;
		}
		
		return false;
	}

	public static void checkTie(String[] board){
		for(int count = 0; count < board.length ; count++){
			if (board[count].equals("-") ){
				
				return;
			}
		}
		System.out.println("Draw");
		gameisRunning = false;
		
		
	}



	public static void switchPlayer(){
	
		if(firstPlayer == "x"){
			firstPlayer = "O";
		}
		else{
			firstPlayer = "x" ;
		}
	}

	public static void checkWin(){
		if (checkvertical(board) || checkDiagonals(board) || checkHorizontal(board)){
			System.out.printf("the winner is %s%n",winner);		
	
		}
	}
	






}