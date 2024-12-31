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
		for(int count = 0 ; count< BOARD.length ; count++ ){
		System.out.printf("%s | %s | %s \n ",BOARD[count][0],BOARD[count][1],BOARD[count][2]);
			if(count<2){
				System.out.println("--------------------");
			}
		}
			
	}

def playerInput(String[][] BOARD){
	playerInput =int(input("Enter row number and column numberyy \ne.g 12 , 13\n  : "));
	if playerInput >= 11 && playerInput <= 13 && BOARD[(playerInput/10)-1][(playerInput%10)-1] == "EMPTY" :
		BOARD[(playerInput/10)-1][(playerInput%10)-1] = firstPlayer;

	elif(playerInput >= 21 && playerInput <= 23 && BOARD[(playerInput/10)-1][(playerInput%10)-1] == "EMPTY":
		BOARD[(playerInput/10)-1][(playerInput%10)-1] = firstPlayer;

	elif(playerInput >= 31 && playerInput <= 33 && BOARD[(playerInput/10)-1][(playerInput%10)-1] == "EMPTY":
		BOARD[(playerInput/10)-1][(playerInput%10)-1] = firstPlayer;

		else:
			print(" Space Occupied ");

def checkHorizontal(BOARD):
	if BOARD[0][0] == BOARD[0][1] && BOARD[0][0]  == BOARD[0][2] && BOARD[0][0] != "EMPTY":
		winner = BOARD[0][0];
		return true ;
		
	elif BOARD[1][0] == BOARD[1][1] && BOARD[1][0]  == BOARD[1][2] && BOARD[1][0] != "EMPTY":
		winner = BOARD[1][0];
		return true ;
		
	elif(BOARD[2][0] == BOARD[2][1] && BOARD[2][0]  == BOARD[2][2] && BOARD[2][0] != "EMPTY":
			winner = BOARD[2][0];
			return true ;
		return false;

def checkvertical(board):
	if BOARD[0][0] == BOARD[1][0] && BOARD[0][0]  == BOARD[2][0] && BOARD[0][0] != "EMPTY":
		winner = BOARD[0][0];
		return true ;

	elif BOARD[0][1] == BOARD[1][1] && BOARD[0][1]  == BOARD[2][1] && BOARD[0][1] != "EMPTY":
			winner = board[0][1];
			return true ;
	elif(BOARD[0][2] == BOARD[1][2] && BOARD[0][2]  == BOARD[2][2] && BOARD[0][2] != "EMPTY":
			winner = BOARD[0][2];
			return true ;
	return false;
	
def checkDiagonals(board):
	if BOARD[0][0] == BOARD[1][1] && BOARD[0][0]  == BOARD[2][2] && BOARD[0][0] != "EMPTY" :
		winner = BOARD[0][0];
		return true ;
	elif BOARD[2][0] == BOARD[1][1] && BOARD[2][0]  == BOARD[0][2] && BOARD[2][0] != "EMPTY":
		winner = BOARD[2][0];
		return true ;
		
	return false;

def checkTie(String[][] BOARD):
	for int index = 0; index < BOARD.length ; index++:
		for int count = 0; count < BOARD.length ; count++:
			if BOARD[index][count] == ("EMPTY") :
				return;
	print("Draw");
	gameisRunning = false;
		
def switchPlayer():
	if firstPlayer == "X" :
		firstPlayer = "O";
	else:
		firstPlayer = "X" ;
def checkWin():
	if checkvertical(BOARD) or checkDiagonals(BOARD) or checkHorizontal(BOARD):
		print(f"the winner is {winner}");		
	
