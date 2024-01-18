/* Problem statement
You are given two integers 'n', and 'm'.



Calculate 'gcd(n,m)', without using library functions.



Note:
The greatest common divisor (gcd) of two numbers 'n' and 'm' is the largest positive number that divides both 'n' and 'm' without leaving a remainder.


Example:
Input: 'n' = 6, 'm' = 4

Output: 2

Explanation:
Here, gcd(4,6) = 2, because 2 is the largest positive integer that divides both 4 and 6. */


public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int ans=1;
        int max = Math.max(n, m);
        for (int i = 1; i <= max; i++) {
            if(n%i==0 && m%i==0)
            ans = i;
        }
        return ans;
    }
}
