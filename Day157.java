import java.util.*;

public class Day157 {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        // String Str = "carrace";
        // String Str = "daily";
        // String Str = "daamm";
        String Str = "dad";
        int NumberOfOdd = 0;

        for(int i=0; i<Str.length(); i++) {
            map.put(Str.charAt(i), map.getOrDefault(Str.charAt(i), 0) + 1);

            if(map.get(Str.charAt(i)) % 2 != 0) {
                NumberOfOdd ++;
            } else  {
                NumberOfOdd --;
            }
        }

        System.out.println((NumberOfOdd > 1) ? "Not Possible" : "Possible");

    }
}
