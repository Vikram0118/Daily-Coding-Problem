import java.util.*;

class Day172 {    
    public static void main(String[] args) {
        String s = "dogcatcatcodecatdog";
        List<String> List = new ArrayList<>();
        List.add("dog");
        List.add("cat");

        // String s = "barfoobazbitbyte";
        // List<String> List = new ArrayList<>();
        // List.add("dog");
        // List.add("cat");

        Set<Integer> AnsList = MySolution (s, List, List.get(0).length() -1);

        System.out.println(AnsList);
    }    

    public static Set<Integer> MySolution(String s, List<String> List, int length) {

        // char[] arr = s.toCharArray();
        Set<Integer> L = new HashSet<>();
        StringBuffer str = new StringBuffer();
        int i=0, ind=Integer.MAX_VALUE ;

        while(i<s.length() - length) {
            int j=i;
            while(j<(i+length+1)) {
                str.append(s.charAt(j));
                j++;
            }
            // System.out.println(str);  // debug

            if(List.contains(str.toString())) {
                // System.out.println(str+" eruku ");  // debug
                str.setLength(0);
                ind = Math.min(ind, i) ;
                L.add(ind);
                i += length +1 ;
            } else {
                ind = Integer.MAX_VALUE;
                i++;
                str.setLength(0);    // important
            }
        }

        return L;
    }
}


// Review : Medium level problem, but it seems relatively easy to me, solved it without any much struggle