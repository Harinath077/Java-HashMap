package questions;
import java.util.HashMap;
public class ValidAnagram {
    private boolean isAnagram(String s, String t){
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }

    public static void main( String[] args){
        ValidAnagram obj = new ValidAnagram();

        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println( obj.isAnagram(s1, t1) );

        String s2 = "rat";
        String t2 = "car";
        System.out.println( obj.isAnagram(s2, t2) );
    }
}
