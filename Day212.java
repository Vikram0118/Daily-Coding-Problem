class Day212 {
    public static void main(String[] args) {

        // int n = 1;  // A
        int n = 701; // ZY
        StringBuilder s = new StringBuilder();
        
        while(n > 0) {
            s.insert(0, (char)('A' + (--n)%26));
            n /= 26;
        }

        System.out.println(s);
    }
}