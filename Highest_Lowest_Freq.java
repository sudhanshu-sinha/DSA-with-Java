/* Problem statement
Given an array 'v' of 'n' numbers.



Your task is to find and return the highest and lowest frequency elements.


If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.



Example:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]

Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2]. */

import java.util.HashMap;

public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        int ans[] = new int[2];
        int maxFreq=0;
        int minFreq=v.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < v.length; i++) {
            int key=v[i];
            if(map.containsKey(key))
            map.put(key, map.get(key)+1);
            else map.put(key, 1);
        }
         for (Integer key : map.keySet()) {
            int frequency = map.get(key);

            if (frequency > maxFreq) {
                maxFreq = frequency;
                ans[0] = key;
            }

            if (frequency < minFreq) {
                minFreq = frequency;
                ans[1] = key;
            }
        }
        return ans;
    }
}
