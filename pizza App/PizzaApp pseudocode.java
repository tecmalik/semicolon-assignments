pizzaApp pseudocode 
stage 1:

display Welcome to Iya Moses joint Ajegunle. 
display available list of pizza 
display ---------------------------------------------------
display |1. pizza Type | number of slice | price per box  |
display |2. sapa size  | 4	       | 2,500		  |
display |3. small money| 6	       | 2,900		  |
display |4. big boys   | 8	       | 4,000		  |
display |5. Odogwu     | 12	       | 5,200		  |
display ---------------------------------------------------
prompt the user enter a type to place an oder   
enter number
srore as type of pizza  
prompt the user to Enter number of pizza puhased 
collect the number 
store as numberofPizza
prompt the user to enter the number of slice that will be leftover 
collect number 
store as leftOverSlice

if pizzaType=sapa pizza
prompth user to Enter the number of Guest you have
colect number 
store as numberOfGuest 
prompth user to enter How many Box of Sappa pizza 
collect number of pizza box
store as numberOfSapaPizzaBoxes 	
display Enter Number of boxes of pizza to buy = numberOfSapaPizzaBoxes

if numberOfGuest < numberOfSapaPizzaBoxes*4 
display Sapa size contains 4 slices per box, numberOfSapaPizzaBoxes  boxes should be sufficient for numberOfGuest persons as it would contain 4*numberOfSapaPizzaBoxes slice in all 
display Number of left over sclice after serving = numberOfSapaPizzaBoxes*4 - numberOfGuest
	else		
display Sapa size contains 4 slices per box, numberOfSapaPizzaBoxes boxes should not be sufficient for numberOfGuest persons as it would contain 4*numberOfSapaPizzaBoxes  slice in all
 display slice will be short with numberOfGuest-numberOfSapaPizzaBoxes*4

else if pizzaType = small money
prompt the user to Enter the number of Guest you have
collect number
store as numberOfGuest 
prompt the user to enter How many Box of small money pizza
collect
store as numberOfsmallmoneyBoxes
display Enter Number of boxes of pizza to buy numberOfsmallmoneyBoxes 

if numberOfGuest < numberOfsmallmoneyBoxes*6
display Small money size contains 6 slices per box, +numberOfsmallmoneyBoxes boxes should be sufficient for numberOfGuest persons as it would contain 6*numberOfsmallmoneyBoxes slice in all
display Number of left over sclice after serving = numberOfsmallmoneyBoxes*6 - numberOfGuest
	else
display Small money size contains 6 slices per box, numberOfsmallmoneyBoxes boxes should not be sufficient for numberOfGuest persons as it would contain 6*numberOfsmallmoneyBoxes slice in all
 slice will be short with numberOfGuest-numberOfsmallmoneyBoxes*6
else if pizzaType == big boys
display Enter the number of Guest you have 
collect store as numberOfGuest 
prompt user to enter How many Box of big boys pizza 
store sd numberOfbigboysBoxes 
display  Number of boxes of pizza to buy = numberOfbigboysBoxes

if numberOfGuest < numberOfbigboysBoxes*8 
display Bigboy size contains 8 slices per box, numberOfbigboysBoxes boxes should be sufficient for  numberOfGuest persons as it would contain  8*numberOfbigboysBoxes slice in all
 display Number of left over sclice after serving = numberOfbigboysBoxes*8 - numberOfGuest
	else{
display Big boy size contains 8 slices per box, numberOfbigboysBoxes boxes should not be sufficient for numberOfGuest persons as it would contain 8*numberOfbigboysBoxes slice in all
display slice will be short with numberOfGuest-numberOfbigboysBoxes*8	
	else if pizzaType= odogw
Enter the number of Guest you have 
collect , save as numberOfGuest
prompth use to How many Box of Odogw pizza 
collecr, store as numberOfOdogwBoxes 
display Number of boxes of pizza to buy numberOfOdogwBoxes

if numberOfGuest < numberOfOdogwBoxes*12 
	display Odogwu size contains 12 slices per box, numberOfOdogwBoxes boxes should be sufficient for  numberOfGuest persons as it would contain 12*numberOfOdogwBoxes slice in all
 printOut Number of left over sclice after serving = numberOfOdogwBoxes*12 - numberOfGuest 
else
display Odoguw size contains 12 slices per box, numberOfOdogwBoxes boxes should not be sufficient for numberOfGuest persons as it would contain 12*numberOfOdogwBoxes slice in all
 display  slice will be short with numberOfGuest-numberOfOdogwBoxes*12


