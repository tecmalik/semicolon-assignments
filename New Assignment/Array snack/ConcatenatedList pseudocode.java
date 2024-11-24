ConcatenatedList pseudocode 
declear a function concatinatedList
taking in 2 array arguments  int[] numbers1 , int[] numbers2
create a new array concatinatedNumbers of length numbers1.length + numbers2.length
initiize newRange = 0;
repeat this step
if the range <= numbers1.length
	concatinatedNumbers[range]= numbers1[range]
else
	concatinatedNumbers[range] =numbers2[newRange]
	increment newRange
return concatinatedNumbers
