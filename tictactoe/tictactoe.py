
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
	

while gameisRunning :
	printGameBoard(board);
	playerInput(board);

