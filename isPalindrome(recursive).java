/* Problem statement
Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.

Note: You are not required to print anything, just implement the function. Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome. */

public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int start = 0;
        int end = str.length()-1;
        return isPal(end, start, str);
    }
    public static boolean isPal(int end, int start, String str){
        if(start>=end)
        {
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)) {return false;}
        
        return isPal(end-1, start+1, str);
    }
}
