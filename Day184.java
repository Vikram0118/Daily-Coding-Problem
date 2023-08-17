
class Day184 {   
    // iterative implementationto return gcd of a and b 
    static int getGCD(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
   
    // recursive implementation
    static int GcdOfArray(int[] arr){
        int gcd = arr[0];
        for (int i = 0; i < arr.length; i++) {
            gcd = getGCD(gcd, arr[i]);
        }
        return gcd;
    }
 
    public static void main(String[] args) {
       int[] arr = { 1, 2, 3 };
        System.out.print(GcdOfArray(arr)+ "\n");
    
        int[] arr1 = { 2, 4, 6, 8 };
        System.out.print(GcdOfArray(arr1)+ "\n");
    }
}

//  Euclidean algorithm (repeated subtraction):

// This approach is based on the principle that the GCD of two numbers A and B will be the same even if we replace the larger number with the difference between A and B. In this approach, we perform GCD operation on A and B repeatedly by replacing A with B and B with the difference(A, B) as long as the difference is greater than 0.

// Java program to compute GCD
// of two numbers using Euclid's
// repeated subtraction approach
// import java.io.*;

// class GFG {

// 	// gcd method returns the GCD of a and b
// 	static int gcd(int a, int b)
// 	{
// 		// if b=0, a is the GCD
// 		if (b == 0)
// 			return a;

// 		// call the gcd() method recursively by
// 		// replacing a with b and b with
// 		// difference(a,b) as long as b != 0
// 		else
// 			return gcd(b, Math.abs(a - b));
// 	}

// 	// Driver method
// 	public static void main(String[] args)
// 	{
// 		int a = 30, b = 20;

// 		// calling gcd() over
// 		// integers 30 and 20
// 		System.out.println("GCD = " + gcd(a, b));
// 	}
// }


// Euclidean algorithm (repeated division): 

// This approach is similar to the repeated subtraction approach. But, in this approach, we replace B with the modulus of A and B instead of the difference.

// Java program to compute GCD
// of two numbers using Euclid's
// repeated division approach
// import java.io.*;
// import java.util.*;

// class GFG {

// 	// gcd method returns the GCD of a and b
// 	static int gcd(int a, int b)
// 	{
// 		// if b=0, a is the GCD
// 		if (b == 0)
// 			return a;

// 		// call the gcd() method recursively by
// 		// replacing a with b and b with
// 		// modulus(a,b) as long as b != 0
// 		else
// 			return gcd(b, a % b);
// 	}
// 	// Driver method
// 	public static void main(String[] args)
// 	{
// 		int a = 20, b = 30;

// 		// calling gcd() over
// 		// integers 30 and 20
// 		System.out.println("GCD = " + gcd(a, b));
// 	}
// }
