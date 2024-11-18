public class SortedArrays{
    public static void main(String[] args) {
        int[] firstArray = {1, 3, 5};
        int[] secondArray = {2, 4, 6};
        int[] combinedArray = new int[firstArray.length + secondArray.length];
        int counter1 = 0; 
        int counter2 = 0; 
        int counter3 = 0; 

        while (counter1 < firstArray.length && counter2< secondArray.length) {
            if (firstArray[counter1] <= secondArray[counter2]) {
                combinedArray[counter3] = firstArray[counter1];
                counter1++;
            } else {
                combinedArray[counter3] = secondArray[counter2];
                counter2++;
            }
            counter3++;
        }

         while (counter1< firstArray.length) {
            combinedArray[counter3] = firstArray[counter3];
            counter1++;
            counter3++;
        }

  
        while (counter2 < secondArray.length) {
            combinedArray[counter3] = secondArray[counter2];
            counter2++;
            counter3++;
        }

        System.out.print("Combined sorted array: ");
        for (int counter = 0; counter < combinedArray.length; counter++) {
    System.out.print(combinedArray[counter] + " ");
}

    }
}
