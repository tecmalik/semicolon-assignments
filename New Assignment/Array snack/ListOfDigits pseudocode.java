ListOfDigits pseudocode 
declare input ListOfDigits to take in int number
initialize size = 0
initialize counter = number
 iterate while number is greater then 0 
equate number = number / 10
increment size 
now 
  create a digitaslist of size 
itrate 
digitsList[digitsList.length - 1 -count] = number%10;
	number = number/10;
return digitsList
