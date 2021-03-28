package src;

/**
70. Climbing Stairs			Easy

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/

public class E70_Climbing_Stairs {
	public int climbStairs(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		
		int[] ways = new int[n];
		
		ways[0] = 1;
		ways[1] = 2;
		
		for (int i=2; i<n; i++) {
			ways[i] = ways[i-2] + ways[i-1];
		}
		
        return ways[n-1];
    }
	
	public static void main(String[] args) {
		E70_Climbing_Stairs e70 = new E70_Climbing_Stairs();
		
		System.out.println(e70.climbStairs(1));
		System.out.println(e70.climbStairs(2));
		System.out.println(e70.climbStairs(3));
		System.out.println(e70.climbStairs(4));
		System.out.println(e70.climbStairs(5));
	}
}
