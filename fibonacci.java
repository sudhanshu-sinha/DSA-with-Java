/* Problem statement
Given an integer ‘n’, return first n Fibonacci numbers using a generator function.



Example:
Input: ‘n’ = 5

Output: 0 1 1 2 3

Explanation: First 5 Fibonacci numbers are: 0, 1, 1, 2, and 3.
Note:
You don't need to print anything. Just implement the given function. */

public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int ans[]= new int[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i]= Solution(i);
        }
        return ans;
    }
    public static int Solution(int n)
    {   
        if(n<=1) {
            return n;
        }
        return Solution(n-1)+Solution(n-2);
    }
}
