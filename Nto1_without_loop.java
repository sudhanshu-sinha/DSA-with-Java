/* Problem statement
You are given an integer ‘n’.



Your task is to return an array containing integers from ‘n’ to ‘1’ (in decreasing order) without using loops.



Note:
In the output, you will see the array returned by you.
Example:
Input: ‘n’ = 5

Output: 5 4 3 2 1

Explanation: An array containing integers from ‘n’ to ‘1’ is [5, 4, 3, 2, 1].  */

public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[] = new int[x];
        int count=x;
        recursive(arr, x, count);
        return arr;
    }
    public static void recursive(int arr[], int x, int count){
        if(count==0) return;
        arr[x-count]=count;
        recursive(arr, x, count-1);
    }
}
