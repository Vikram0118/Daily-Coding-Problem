import java.util.*;

public class Day211 {
    public static void main(String[] args) {
        String Str = "abracadabra";
        String subStr = "abr";
        List<Integer> L = MySolution(Str, subStr);

        for(int i : L) {
            System.out.print(i+" ");
        }
    }

    public static List<Integer> MySolution(String Str, String subStr) {
        List<Integer> L = new ArrayList<>();
        int length = Str.length();
        int sublength = subStr.length();
        int i=0;
        String temp="";

        while(i < length && (length - i) >= sublength) {
            if(Str.charAt(i) == subStr.charAt(0)) {
                temp = Str.substring(i, i+sublength);
                if(temp.equals(subStr)) {
                    L.add(i);
                }
            }
            i++;
        }

        return L;
    }
}
