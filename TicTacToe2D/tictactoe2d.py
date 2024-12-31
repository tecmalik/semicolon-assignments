
BOARD = [["EMPTY","EMPTY","EMPTY"],["EMPTY","EMPTY","EMPTY"],["EMPTY","EMPTY","EMPTY"]];

firstPlayer = "X"
winner = " ";
gameisRunning = True;


def printGameBoard(BOARD):
	for count in range(len(BOARD)):
		print("%s | %s | %s \n " %(BOARD[count][0],BOARD[count][1],BOARD[count][2]));
		if count<2 :
			print("--------------------");


def playerInput(BOARD):
	playerInput =int(input("Enter row number and column number \ne.g 12 , 13\n  : "));
	if playerInput >= 11 and playerInput <= 13 and BOARD[(playerInput//10)-1][(playerInput%10)-1] == "EMPTY" :
		BOARD[(playerInput//10)-1][(playerInput%10)-1] = firstPlayer;

	elif playerInput >= 21 and playerInput <= 23 and BOARD[(playerInput//10)-1][(playerInput%10)-1] == "EMPTY" :
		BOARD[(playerInput//10)-1][(playerInput%10)-1] = firstPlayer;

	elif playerInput >= 31 and playerInput <= 33 and BOARD[(playerInput//10)-1][(playerInput%10)-1] == "EMPTY" :
		BOARD[(playerInput//10)-1][(playerInput%10)-1] = firstPlayer;

	else:
		print(" Space Occupied ");

def checkHorizontal(BOARD):
	global winner
	if BOARD[0][0] == BOARD[0][1] and BOARD[0][0]  == BOARD[0][2] and BOARD[0][0] != "EMPTY":
		winner = BOARD[0][0];
		return True ;
		
	elif BOARD[1][0] == BOARD[1][1] and BOARD[1][0]  == BOARD[1][2] and BOARD[1][0] != "EMPTY":
		winner = BOARD[1][0];
		return True ;
		
	elif BOARD[2][0] == BOARD[2][1] and BOARD[2][0]  == BOARD[2][2] and BOARD[2][0] != "EMPTY":
			winner = BOARD[2][0];
			return True ;
	return False;

def checkvertical(board):
	global winner 
	if BOARD[0][0] == BOARD[1][0] and BOARD[0][0]  == BOARD[2][0] and BOARD[0][0] != "EMPTY":
		winner = BOARD[0][0];
		return True ;

	elif BOARD[0][1] == BOARD[1][1] and BOARD[0][1]  == BOARD[2][1] and BOARD[0][1] != "EMPTY":
			winner = board[0][1];
			return True ;
	elif BOARD[0][2] == BOARD[1][2] and BOARD[0][2]  == BOARD[2][2] and BOARD[0][2] != "EMPTY":
			winner = BOARD[0][2];
			return True ;
	return False;
	
def checkDiagonals(board):
	global winner
	if BOARD[0][0] == BOARD[1][1] and BOARD[0][0]  == BOARD[2][2] and BOARD[0][0] != "EMPTY" :
		winner = BOARD[0][0];
		return True ;
	elif BOARD[2][0] == BOARD[1][1] and BOARD[2][0]  == BOARD[0][2] and BOARD[2][0] != "EMPTY":
		winner = BOARD[2][0];
		return True ;
		
	return False;

def checkTie(BOARD):
	global gameisRunning
	for index in range(len(BOARD)):
		for count in range(len(BOARD)):
			if BOARD[index][count] == ("EMPTY"):
				return;
	print("Draw");
	gameisRunning = False;
		
def switchPlayer():
	global firstPlayer 
	if firstPlayer == "X" :
		firstPlayer = "O";
	else:
		firstPlayer = "X";

def checkWin():
	if checkvertical(BOARD) or checkDiagonals(BOARD) or checkHorizontal(BOARD):
		print(f"the winner is {winner}");		
	

while(gameisRunning):
	printGameBoard(BOARD);
	playerInput(BOARD);
	checkWin();
	checkTie(BOARD);
	switchPlayer();

