// egg drop - more of a puzzle
// 1. brute force - frop from every floor
    // - worst case will be - floor - 1 number of eggs is needed
// 2. binary search - if we have unlimited number of eggs then it can be good approach but for limited number of eggs this way doesn't work 
    // - worst case will be we have to drop (no.of.floors/2) number of eggs
// 3. divide nd conquer
    //   - lets say i have 100 floors so i will move in 10 increments and drop the eggs and check if it breaks , if not i will increment else i will do binary search in the range of 10 decremnet 
    // then the worst case wil be 19 eggs in this case
// 4.balancing linear drop :  N(N+1) / 2

import java.util.*;

class Day230 {
 
    // A utility function to get
    // maximum of two integers
    static int max(int a, int b) { return (a > b) ? a : b; }
 
    /* Function to get minimum number
 of trials needed in worst
    case with n eggs and k floors */
    static int eggDrop(int n, int k)
    {
        /* A 2D table where entry eggFloor[i][j]
 will represent minimum number of trials
needed for i eggs and j floors. */
        int eggFloor[][] = new int[n + 1][k + 1];
        int res;
        int i, j, x;
 
        // We need one trial for one floor and
        // 0 trials for 0 floors
        for (i = 1; i <= n; i++) {
            eggFloor[i][1] = 1;
            eggFloor[i][0] = 0;
        }
 
        // We always need j trials for one egg
        // and j floors.
        for (j = 1; j <= k; j++)
            eggFloor[1][j] = j;
 
        // Fill rest of the entries in table using
        // optimal substructure property
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= k; j++) {
                eggFloor[i][j] = Integer.MAX_VALUE;
                for (x = 1; x <= j; x++) {
                    res = 1
                          + max(eggFloor[i - 1][x - 1],
                                eggFloor[i][j - x]);
                    if (res < eggFloor[i][j])
                        eggFloor[i][j] = res;
                }
            }
        }
 
        // eggFloor[n][k] holds the result
        return eggFloor[n][k];
    }
 
    /* Driver code */
    public static void main(String args[])
    {
        int n = 2, k = 36;
        System.out.println(
            "Minimum number of trials in worst"
            + " case with " + n + "  eggs and " + k
            + " floors is " + eggDrop(n, k));
    }
}

