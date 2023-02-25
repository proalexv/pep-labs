
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
     String[] words = in.split("\\s+");
    StringBuilder sb = new StringBuilder();

    for (String word : words) {
        char firstChar = word.charAt(0);
        String restOfWord = word.substring(1);
        sb.append(restOfWord).append(firstChar).append("ay").append(" ");
    }

    sb.deleteCharAt(sb.length() - 1); // remove extra space at the end

    return sb.toString();
}