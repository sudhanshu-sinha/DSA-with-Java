/* Problem statement
https://www.codingninjas.com/studio/problems/check-prime_624934?leftPanelTabValue=PROBLEM
A prime number is a positive integer that is divisible by exactly 2 integers, 1 and the number itself.



You are given a number 'n'.



Find out whether 'n' is prime or not.



Example :
Input: 'n' = 5

Output: YES

Explanation: 5 is only divisible by 1 and 5. 2, 3 and 4 do not divide 5. */

public class Solution {
	public static String isPrime(int num) {
		//Your code goes here
		if(num<2) return "NO";
		for (int i = 2; i < Math.sqrt(num); i++) {
			if(num%i==0) return "NO";
		}
		return "YES";
	}
}
