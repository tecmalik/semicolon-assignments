
firstPlayer = "x"
board = ["-","-","-","-","-","-","-","-","-"]

winner = " ";
gameisRunning = True;

def printGameBoard(board):
	print("%s | %s | %s"%(board[0],board[1],board[2]));
	print("----------");
	print("%s | %s | %s "%(board[3],board[4],board[5]));
	print("----------");
	print("%s | %s | %s " % (board[6],board[7],board[8]));


def playerInput(board):
	playerInput = int(input("Enter a number 1 - 9 : "));
	if playerInput >= 1 and playerInput <= 9 and board[playerInput-1] == "-" :
		board[playerInput-1] = firstPlayer;
	else :
		print(" Space Occupied ");
	

 
def checkHorizontal(board):
	global winner
	if board[0] == board[1] and board[0]  == board[2] and board[0] != "-" :
		winner = board[2];
		return True ;
	elif board[3] == board[4] and board[3]  == board[5] and board[3] != "-":
		winner = board[2];
		return True ;
	elif board[6] == board[7] and board[6]  == board[8] and board[6] != "-":
		winner = board[2];
		return True ;



def checkvertical(board):
	global winner
	if board[0] == board[3] and board[0]  == board[6] and board[0] != "-":
		winner = board[0];
		return True ;
	elif board[1] == board[4] and board[1]  == board[7] and board[1] != "-":
		winner = board[1];
		return True ;
	elif board[2] == board[5] and board[2]  == board[8] and board[2] != "-":
		winner = board[2];
		return True ;
	
	
def checkDiagonals(board):
	global winner
	if board[0] == board[4] and board[0]  == board[8] and board[0] != "-":
		winner = board[0];
		return True ;
	elif board[2] == board[4] and board[1]  == board[7] and board[1] != "-":
		winner = board[2];	
		return True ;
		
def checkTie(board):
	global gameRun
	if "-" not in board:
		print("Draw")
	gameRun = False

def switchPlayer():
	global currentplayer
	if firstPlayer == "x":
		firstPlayer = "O"
	else:
		firstPlayer = "x"

def checkWin():
	if checkvertical(board) or checkDiagonals(board) or checkHorizontal(board):
		print(f"the winner is {winner}")		
	

while gameisRunning :
	printGameBoard(board);
	playerInput(board);
	checkWin()
	checkTie(board)
	switchPlayer()
	
