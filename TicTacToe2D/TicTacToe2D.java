import java.util.Scanner;
public class TicTacToe2D{
	static Scanner input = new Scanner(System.in);
	static String[][] board = {
				   {"-","-","-"},
				   {"-","-","-"},
				   {"-","-","-"}
				   };
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
	public static void printGameBoard(String[][] board){
		for(int count = 0 ; count< board.length ){
		System.out.printf("%s | %s | %s \n ",board[count][1],board[count][2],board[count][3]);
			if(count<=2){
				System.out.println("---------");
			}
		}
			
	}

	public static void playerInput(String[][] board){
		System.out.print("Enter row number and column numberyy \ne.g 12 , 13\n  : ");
		int playerInput = input.nextInt();

		if(playerInput >= 11 && playerInput <= 13 && board[playerInput-1] == "-" ){
			board[playerInput-1/10][playerInput-1%10] = firstPlayer;
		}
		if(playerInput >= 21 && playerInput <= 23 && board[playerInput-1] == "-" ){
			board[playerInput-1/10][playerInput-1%10] = firstPlayer;
		}
		if(playerInput >= 31 && playerInput <= 33 && board[playerInput-1] == "-" ){
			board[playerInput-1/10][playerInput-1%10] = firstPlayer;
		}

		else {
			System.out.println(" Space Occupied ");
		}
		
	}
	
	public static boolean checkHorizontal(String[][] board){
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


	public static boolean checkvertical(String[][] board){
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
	
	public static boolean checkDiagonals(String[][] board){
	
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

	public static void checkTie(String[][] board){
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