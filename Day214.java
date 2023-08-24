class Day214 {
    public static void main(String[] args) {

        // int n = 156;
        // int i = 128;  // highest base
        // int ans = 1;
        // int result = Integer.MIN_VALUE;
        // StringBuilder Str = new StringBuilder();

        // while(n > 0) {
        //     if(n >= i) {
        //         n -= i;
        //         Str.append("1");
        //     } else {
        //         Str.append("0");
        //     }
        //     i /= 2;
        // } 

        // for(int j=0; j<Str.length()-1; j++) {
        //     if(Str.charAt(j) == '1') {
        //         if(Str.charAt(j+1) == '1') {
        //             ans ++;
        //         }
        //     } else {
        //         ans = 1;
        //     }
        //     result = Math.max(ans , result);
        // }

        // System.out.println(result);
        // // System.out.println(Str);

        // -------------------------------------------------------------------------------

        //using bit wise operator

        int n = 156;
        int longestConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;

        while (n > 0) {
            if ((n & 1) == 1) { // Check if the rightmost bit is 1
                currentConsecutiveOnes++;
                longestConsecutiveOnes = Math.max(longestConsecutiveOnes, currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
            n >>= 1; // Right-shift n by 1 to process the next bit
            System.out.println(n);
        }

        System.out.println(longestConsecutiveOnes);
        
    }
}
