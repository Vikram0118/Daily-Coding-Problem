class Day210 {
    public static void main(String[] args) {
        // collatz problem 
        // This problem in insolvable - no trend is follwed in this , whatever the positive integer you and follow the two steps it will end up being the 4 2 1 loop at the end ;
        int longestSequence = -1;
        for(int i=1; i<= 1000000; i++) {
            longestSequence = Math.max(longestSequence, getSequence(i, 0));
        }

        System.out.println(longestSequence);
    }

    static int getSequence(int i,int length) {
        if(i == 1) {
            return length;
        } 
        if(i % 2 == 0) {
            return getSequence(i/2, length + 1);
        } 
        return getSequence(((3*i) + 1), length + 1);
    }
}