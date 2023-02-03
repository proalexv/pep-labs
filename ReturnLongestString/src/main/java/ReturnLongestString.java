
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        
        int[] max = new int[1];
        max[0] = -999;
         for(int i = 0; i < arr.length;i++)
         {
             if(str.length() > max[0])
             {
                 max[0] = arr[i];
             }
            
         }
     return max[0];
     
     
 }
    }
}
