CombinedList pseudocode 
declear a function combinedList
taking in 2 array arguments  int[] numbers1 , int[] numbers2
create a new array combinedNumbers of length numbers1.length + numbers2.length
initialize newRange1 = 0;
initialize newRange2 = 0;
repeat this step
if the range%2 != 0 
	combinedNumbers[range]= numbers1[newRange1]
	increment newRange1
else
	combinedNumbers[range] =numbers2[newRange]
	increment newRange2
return combinedNumbers
