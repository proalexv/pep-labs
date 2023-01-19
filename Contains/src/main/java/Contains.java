

public class Contains {
    boolean b; 

    /**
     * This method should search an array to see if that array contains some value.
     * You will need to use a for loop to check every value of the array to see if it matches the target value.
     *
     * @param arr array to be manipulated.
     * @param target the value that the method should be searching for.
     * @return true if arr contains target, false otherwise.
     */
    public boolean arrayContains(int[] arr, int target){
       //how to call the arrary
        //int[] arr;
for (int i = 0; i < arr.length; i++) {
    //maybe the issue is here it might stop here at the end of the list and set b to whatever that is instead of
     //stoping when the condion is met
    if (target == arr[i]) {
        b = true;

    }else{
       b = false; }
    
}
return b;
    }
}