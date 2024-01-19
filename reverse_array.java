/* Problem statement
Given an array 'arr' of size 'n'.



Return an array with all the elements placed in reverse order.



Note:
You don’t need to print anything. Just implement the given function.
Example:
Input: n = 6, arr = [5, 7, 8, 1, 6, 3]

Output: [3, 6, 1, 8, 7, 5]

Explanation: After reversing the array, it looks like this [3, 6, 1, 8, 7, 5]. */

public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int start = 0;
        int end=n-1;
        rev(start,end,nums);
        return nums;
    }
    public static void rev(int start, int end, int nums[]){
        if (start<end) {
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            rev(start+1, end-1, nums);
        }
    }
}
