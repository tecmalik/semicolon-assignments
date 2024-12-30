
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
	if board[0] == board[1] and board[0]  == board[2] and board[0] != "-" :
		winner = board[2];
		return True ;
	elif board[3] == board[4] and board[3]  == board[5] and board[3] != "-":
		winner = board[2];
		return True ;
	elif board[6] == board[7] and board[6]  == board[8] and board[6] != "-":
		winner = board[2];
		return True ;

	return False;


def checkvertical(board):
	if(board[0] == board[3] and board[0]  == board[6] and board[0] != "-"){
		winner = board[0];
		return True ;
	elif(board[1] == board[4] and board[1]  == board[7] and board[1] != "-"){
		winner = board[1];
		return True ;
	elif(board[2] == board[5] and board[2]  == board[8] and board[2] != "-"){
		winner = board[2];
		return True ;
	return False;
	
def checkDiagonals(board):
	if board[0] == board[4] and board[0]  == board[8] and board[0] != "-":
		winner = board[0];
		return True ;
	elif board[2] == board[4] and board[1]  == board[7] and board[1] != "-":
		winner = board[2];	
		return True ;
		
	return False;



while gameisRunning :
	printGameBoard(board);
	playerInput(board);
