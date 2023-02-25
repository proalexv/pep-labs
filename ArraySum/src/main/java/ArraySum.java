import java.util.Arrays;
public class ArraySum {
   public static void main (String args[]){
    /**
     * This method should return the sum of all ints in an array - this is a very useful trick to know!
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints
     * @return 
     * 
     * @return the sum of all values in arr.
     */
  
     public static int sum(int[] arr) {
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
          sum += arr[i];
      }
      return sum;
  }
}

//*  for (let index = 0; index < array.length; index++) {
  //console.log(array[index]);
  // sum =0
  //arr[index]
  //sum = sum + arr[index]
  //implement a for while loop to itterate through the index, so we may start adding values to the arry
  //shortcut given above by reading