package src;


/**
69. Sqrt(x)

Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Example 1:
Input: x = 4
Output: 2

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 

Constraints:
0 <= x <= 231 - 1
 */

public class E69_Sqrt {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
    
    public static void main(String[] args) {
    	E69_Sqrt e69 = new E69_Sqrt();
		System.out.println(e69.mySqrt(4));
		System.out.println(e69.mySqrt(8));
		System.out.println(e69.mySqrt(9));
	}
}
