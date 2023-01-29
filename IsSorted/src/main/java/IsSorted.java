public class IsSorted {
    /**
     * Return true if arr is sorted, smallest to largest, false otherwise.
     * For example, {1,2,3,4} is storted but {1,2,4,3} is unsorted
     *
     * @param arr an int array
     * @return true if arr is sorted (all the numbers are in order). false if arr is not sorted.
     */
    public boolean checkSort(int[] arr){
        // Good practice in Java is first to ouline thoughts in writing before attemping to write any code , here is my Idea on how to approach this probluem 
        // Itterate through the arrary  
        // Create an if else stattment 
        //If element [n]  is less than element [n+1] cotouinine
        //if not end
        // Couldint doing soi untill we have reached the end of the arrary/lenght



        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[i+1]) {
                return false;
            }
                else{
                    return true;
                }
    }
        return true;
}
}
