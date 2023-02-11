// hard -- snapchat -- number of rooms sum

class Day21Easy{
    public static void main(String[] args) {
        int a[][] = {{30, 70},
                     {0, 50},
                     {60, 150}
                    };
        // int a[][] = {{30, 50},
        //              {20, 160},
        //              {0, 150},
        //              {60, 150}
        //             };
        int n =1;

        // for(int i=0; i<a.length; i++) {
            for(int j=1; j<a.length; j++) {
                if( ( (a[0][0]>a[j][0]) && (a[0][1]>a[j][1]) && (a[j][1]>a[0][0]) ) || 
                    ( (a[0][0]<a[j][0]) && (a[j][0]<a[0][1]) && (a[j][1]>a[0][1]) ) || 
                    ( (a[0][0]<a[j][0]) && (a[0][1]>a[j][1]) ) ||
                    ( (a[0][0]>a[j][0]) && (a[0][1]<a[j][1]) ) ) {
                    n++;
                    System.out.println("j = "+j);
                }
            }
        // }

        System.out.println(n);
    }
}