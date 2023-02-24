import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
            Map<Character, Integer> charCount = new HashMap<>();
    
            for (char c1 : str.toCharArray()) {
                int count = charCount.getOrDefault(c1, 0);
                charCount.put(c1, count + 1);
            }
    
            char mostCommonCharter = 0;
            int maxCount = 0;
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    mostCommonCharter = entry.getKey();
                    maxCount = entry.getValue();
                }
            }
    
            return mostCommonCharter;
        }
    }