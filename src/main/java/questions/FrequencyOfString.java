package questions;
import java.util.HashMap;
public class FrequencyOfString {
    private void frequencyOfString(String s){
        // HashMap to store character and its count
        HashMap<Character, Integer> frequencyMap  = new HashMap<>();

        // Convert string to character array and iterate through each character
        for(char ch : s.toCharArray()) {

            // getOrDefault(ch,0) returns 0 if character is not present
            // otherwise returns existing count
            frequencyMap .put(ch, frequencyMap .getOrDefault(ch, 0) + 1);

        }

        System.out.println(frequencyMap );
    }

    public static void main( String[] args){
        String s = "aabccd";
        FrequencyOfString obj = new FrequencyOfString();
        obj.frequencyOfString(s);
    }
}
