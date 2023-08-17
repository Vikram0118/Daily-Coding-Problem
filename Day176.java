import java.util.*;

// Check if two given Strings are Isomorphic to each other

class Day176 {
    public static void main(String[] args) {
        String s1 = "foo";
        String s2 = "abb";

        // My Solution 1 :
        // if(MySolution(s1)) {
        //     if(MySolution(s2)) {
        //         System.out.println("Balanced");
        //         return;
        //     } else {
        //         System.out.println("Not Balanced");
        //         return;
        //     }
        // } else {
        //     System.out.println("Not Balanced");
        //     return;
        // }

        // My Solution 2 :
        if(MySolution2(s1, s2)) {
            if(MySolution2(s2, s1)) {
                System.out.println("Balanced");
                return;
            } else {
                System.out.println("Not Balanced");
                return;
            }
        } else {
            System.out.println("Not Balanced");
            return;
        }

        
        
    }

    public static boolean MySolution(String s) {
        Set<Character> S = new HashSet<>();

        int i=0;

        while(i<s.length()) {
            S.add(s.charAt(i));
            i++;
        }

        return (S.size() == s.length()) ? true : false;
    }

    public static boolean MySolution2(String s1, String s2) {
        Map<Character, Character> M = new HashMap<>();

        int i=0;

        while( i<s1.length() ) {
            if(M.containsKey(s1.charAt(i))) {
                return false;
            } else {
                M.put(s1.charAt(i), s2.charAt(i));
            }
            i++;
        }
        return true;
    }

    public static boolean areIsomorphic(String str1, String str2) {
 
        HashMap<Character, Character> charCount = new HashMap<>();
        char c = 'a';
        for (int i = 0; i < str1.length(); i++) {
            if (charCount.containsKey(str1.charAt(i))) {
                c = charCount.get(str1.charAt(i));
                if (c != str2.charAt(i))
                    return false;    // important
            }
            else if (!charCount.containsValue(str2.charAt(i))) {   // important
                charCount.put(str1.charAt(i),
                str2.charAt(i));
            }
            else {
                return false;
            }
        }
        return true;
    }
}

