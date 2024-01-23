/* Problem statement
Sort the given unsorted array 'arr' of size 'N' in non-decreasing order using the selection sort algorithm.

 Note:
Change in the input array/list itself. 

Example:
Input:
N = 5
arr = {8, 6, 2, 5, 1}

Output:
1 2 5 6 8 
*/

public class Solution {
    public static void selectionSort(int[] arr) {
        //Your code goes here
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
