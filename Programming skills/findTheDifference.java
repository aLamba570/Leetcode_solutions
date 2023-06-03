import java.util.HashMap;
import java.util.Map;

public class findTheDifference {
    public char findTheDifference1(String s, String t){
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (char c : s.toCharArray()) {
            countS.put(c, countS.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        for(char c:countT.keySet()){
            if(countS.get(c)==null || countS.get(c)!=countT.get(c)){
                return c;
            }
        }

        return 0;
    }
}
