import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){

         // Create an empty Set
        Set<Integer> set = new HashSet<>();
 
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            
            // Add each element into the set
            set.add(nums[i]);
          }
    
 
        // Return the converted Set
        int arrayLength = nums.length;        
        int setLength = set.size();

        if (arrayLength == setLength) {
           return false;
          } 
          return true;
         
    
    }
}

