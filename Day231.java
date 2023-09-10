import java.util.*;

public class Day231 {
    public static void main(String[] args) {
        
        String Str = "aaabbc";
        char[] charCount = new char[26];
        
        for(int i=0; i<Str.length(); i++) {
            charCount[Str.charAt(i) - 'a']++;
        }

        int max = 0;    // to hold the maximum occurance of a letter
        char maxC = 'a';  // to hold which occur for maximum number of times 
        int total = 0;
        for (int i=0; i<charCount.length; i++) {
            total += charCount[i];
            if (charCount[i] > max) {
                max = charCount[i];
                maxC = (char)(i+'a');
                // System.out.println(maxC);
            }
        }

        // System.out.println(total-max);
        // System.out.println(max -1);

        if (total-max < max-1) {
            System.out.println("Null");
            return;
        }

        char[] res = new char[Str.length()];  // result array
        int idx = 0;
        while (charCount[maxC-'a'] > 0) {
            // System.out.println(charCount[maxC-'a']);
            res[idx] = maxC;
            idx += 2;
            charCount[maxC-'a']--;
        }
        for (int i = 0; i < charCount.length; i++) {
            while (charCount[i] > 0) {
                if (idx >= res.length) {
                    idx = 1;
                }
                res[idx] = (char) (i + 'a');
                idx += 2;
                charCount[i]--;
            }
        }

        System.out.println();
        System.out.println(res);
    }
}
