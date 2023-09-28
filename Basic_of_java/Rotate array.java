/*Problem Statement:Given an array 'arr' with 'n'elements, the task is to rotate the array to the left by 'k'steps, where 'k' is non-negative.
Example:
'arr' = [1, 2, 3, 4, 5]
'k' = 1 rotated array = [2, 3, 4, 5, 1]
'k' = 2 rotated array = [3, 4, 5, 1, 2]
'k' = 3 rotated array = [4, 5, 1, 2, 3] and so on.
Detailed explanation (Input/output format)
Input Format:
The first line contains an integer 'n' representing the size of the array.
The second line contains 'n' space- separated integers representing the elements of the array.
The last line contains an integer 'k' representing the number of times the array has to be rotated in the left direction.
Output Format:
The output contains 'n' space-separated integers representing the Rotated array elements.
Note:-
You don't need to print anything. Just implement the given function.
Sample Input 1:
8 
7 5 2 11 2 43 1 1
2
Sample Output 1:
2 11 2 43 1 1 7 5
Sample Input 2:
4
5 6 7 8
3
Sample Output 2:
8 5 6 7
Constraints:
1<= 'n' <= 10^3
1<= 'arr'[i] <= 10^9
1 <= `k' < 'n'
*/
import java.util.ArrayList;
public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n= arr.size();
        for(int i=0;i<k;i++){
            int temp = arr.get(0);
            for(int j=0;j<n-1;j++){
                arr.set(j,arr.get(j+1));
            }
            arr.set(n-1,temp);
        }
        return arr;
    }
}
