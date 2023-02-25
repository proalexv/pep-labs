
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     *
     * @param in A string.
     * @return the pig latin form of in.
     *
     *      * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

      */
      public static String returnPigLatin(String word) {


        String firstLetter = word.substring(0, 1);
        String restOfTheWord = word.substring(1,word.length());
        return restOfTheWord + firstLetter + "ay";
    }
}