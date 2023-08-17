public class Day206 {
    public static void main(String[] args) {

        // int[] P = {2, 1, 0};
        // char[] C = {'a', 'b', 'c'};

        int[] P = {3, 0, 2, 1};
        char[] C = {'a', 'b', 'c', 'd'};

        MySolution(P, C);

        for(char c : C) {
            System.out.print(c+" ");
        }
    }

    public static void MySolution(int[] P, char[] C) {

        for(int i=0; i<C.length; i++) {
            
            while(i != P[i]) {
                swap(C, i, P[i]);
                swap(P, i, P[i]);
            }
        }
    }

    public static void swap(char[] c, int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void swap(int[] p, int i, int j) {
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;
    }
}
