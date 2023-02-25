
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     *
      */
      StringBuilder result = new StringBuilder();
    
      String[] words = in.split(" ");
      
      for(String word: words){
          if(word.length() == 1){
              result.append(word).append("ay");
          }else{
              result.append(word.substring(1)).append(word.charAt(0)).append("ay");
          }
          result.append(" ");
      }
      
      return result.toString().trim();
  }
}