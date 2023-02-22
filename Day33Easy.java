public class Day33Easy {
    public static void main(String[] args) {
        int a[] = {2, 1, 5, 7, 2, 0, 5};

        int n = a.length;

        for(int i=0; i<n; i++) {
            if(i==0){
                System.out.println(a[i]);
            } else if(i%2 != 0){
                System.out.println(i+" "+((float)(a[i] + a[i-1])/2));
            } else {
                System.out.println((float)a[i/2]);
            }
        }
    }
}
