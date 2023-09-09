import java.util.*;

public class Day159 {
    public static void main(String[] args) {
        // String Str = "acbbac";
        String Str = "abcdef";
        Set<Character> Set = new HashSet<>();

        for(int i=0; i<Str.length(); i++) {
            char tempChar = Str.charAt(i);
            if(Set.contains(tempChar)) {
                System.out.println("The first Recurring Character is : "+tempChar);
                return;
            } else {
                Set.add(tempChar);
            }
        }

        System.out.println("The first Recurring Character is : "+null);

    }
}
