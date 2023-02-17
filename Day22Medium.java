
// This problem was asked by Microsoft.

// Given a dictionary of words and a string made up of those words (no spaces), 
// return the original sentence in a list. If there is more than one possible reconstruction,
//  return any of them. If there is no possible reconstruction, then return null.

// For example, given the set of words 'quick', 'brown', 'the', 'fox', and 
// the string "thequickbrownfox", you should return ['the', 'quick', 'brown', 'fox'].

// Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and 
// the string "bedbathandbeyond", return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

import java.util.HashMap;
import java.util.Map;

public class Day22Medium {
    public static void main(String[] args) {
        // String s1="quick", s2="brown", s3="the", s4="fox";  
        Map<Integer, String> dictionary = new HashMap<>();

        dictionary.put(1, "quick");
        dictionary.put(2, "brown");
        dictionary.put(3, "the");
        dictionary.put(4, "fox");
        // String sentence = "thequickbrownfox";

        for(int i=0; i< dictionary.size(); i++){
            
        }

        System.out.println(dictionary);

    }
}
