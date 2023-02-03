
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     * 
     * Best practice to outline a solution before we begin programing
     * We first need a way to compare the length between two elements 
     * 
     * 
     * 
     */
    String max;
    public String longest(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            int length = arr[i].length();
            int length2 =arr[i+1].length();
            if (length2 > length) {
                max = arr[i+1];
              }
          }
       
       return max;
    }
}
