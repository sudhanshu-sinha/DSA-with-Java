/* Problem statement
You are given an integer ‘n’.



Print “Coding Ninjas ” ‘n’ times, without using a loop.



Example:
Input: ‘n’  = 4

Output:
Coding Ninjas Coding Ninjas Coding Ninjas Coding Ninjas 

Explanation: “Coding Ninjas” is printed 4 times. 


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
3


Sample Output 1:
Coding Ninjas Coding Ninjas Coding Ninjas 


Explanation of sample output 1:
“Coding Ninjas” is printed 3 times. 

Sample Input 2:
5


Sample Output 2:
Coding Ninjas Coding Ninjas Coding Ninjas Coding Ninjas Coding Ninjas 


Expected Time Complexity:
Try to solve this in O(n).


Expected Space Complexity:
Try to solve this in O(n).


Constraints:
1 <= 'n' <= 10^4    */


public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int arr[] = new int[x];
        recursive(arr, x);
        return arr;
    }
    public static void recursive(int arr[], int x){
        if(x==0) return;
        arr[x-1]= x;
        recursive(arr, x-1);
    }
}
