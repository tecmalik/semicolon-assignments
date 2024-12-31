import java.util.Scanner;
public class TicTacToe2D{
	static Scanner input = new Scanner(System.in);
	static String[][] BOARD = {
				   {"EMPTY","EMPTY","EMPTY"},
				   {"EMPTY","EMPTY","EMPTY"},
				   {"EMPTY","EMPTY","EMPTY"}
				   };
	static String firstPlayer = "X";
	static String winner = " ";
	static Boolean gameisRunning = true;

	public static void main(String[] args){


		
		
		while(gameisRunning){

			printGameBoard(BOARD);
			playerInput(BOARD);
			checkWin();
			checkTie(BOARD);
			switchPlayer();
		}


	}
	public static void printGameBoard(String[][] BOARD){
		for(int count = 0 ; count< BOARD.length ){
		System.out.printf("%s | %s | %s \n ",BOARD[count][1],BOARD[count][2],BOARD[count][3]);
			if(count<=2){
				System.out.println("---------");
			}
		}
			
	}

	public static void playerInput(String[][] BOARD){
		System.out.print("Enter row number and column numberyy \ne.g 12 , 13\n  : ");
		int playerInput = input.nextInt();

		if(playerInput >= 11 && playerInput <= 13 && BOARD[playerInput-1] == "EMPTY" ){
			BOARD[playerInput-1/10][playerInput-1%10] = firstPlayer;
		}
		if(playerInput >= 21 && playerInput <= 23 && BOARD[playerInput-1] == "EMPTY" ){
			BOARD[playerInput-1/10][playerInput-1%10] = firstPlayer;
		}
		if(playerInput >= 31 && playerInput <= 33 && BOARD[playerInput-1] == "EMPTY" ){
			BOARD[playerInput-1/10][playerInput-1%10] = firstPlayer;
		}

		else {
			System.out.println(" Space Occupied ");
		}
		
	}
	
	public static boolean checkHorizontal(String[][] BOARD){
		if(BOARD[0] == BOARD[1] && BOARD[0]  == BOARD[2] && BOARD[0] != "EMPTY"){
			winner = board[2];
			return true ;
		}
		else if(BOARD[3] == BOARD[4] && BOARD[3]  == BOARD[5] && BOARD[3] != "EMPTY"){
			winner = board[2];
			return true ;
		}
		else if(BOARD[6] == BOARD[7] && BOARD[6]  == BOARD[8] && BOARD[6] != "EMPTY"){
			winner = BOARD[2];
			return true ;
		}

		return false;
	}


	public static boolean checkvertical(String[][] board){
		if(BOARD[0] == BOARD[3] && board[0]  == board[6] && board[0] != "EMPTY"){
			winner = board[0];
			return true ;
		}
		else if(board[1] == board[4] && board[1]  == board[7] && board[1] != "EMPTY"){
			winner = board[1];
			return true ;
		}
		else if(board[2] == board[5] && board[2]  == board[8] && board[2] != "EMPTY"){
			winner = board[2];
			return true ;
		}
		return false;
	}
	
	public static boolean checkDiagonals(String[][] board){
	
		if(board[0] == board[4] && board[0]  == board[8] && board[0] != "EMPTY"){
			winner = board[0];
			return true ;
		}
		else if(board[2] == board[4] && board[1]  == board[7] && board[1] != "EMPTY"){
			winner = board[2];
			return true ;
		}
		
		return false;
	}

	public static void checkTie(String[][] board){
		for(int count = 0; count < board.length ; count++){
			if (board[count].equals("EMPTY") ){
				
				return;
			}
		}
		System.out.println("Draw");
		gameisRunning = false;
		
		
	}



	public static void switchPlayer(){
	
		if(firstPlayer == "X"){
			firstPlayer = "O";
		}
		else{
			firstPlayer = "X" ;
		}
	}

	public static void checkWin(){
		if (checkvertical(board) || checkDiagonals(board) || checkHorizontal(board)){
			System.out.printf("the winner is %s%n",winner);		
	
		}
	}
	






}