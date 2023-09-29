/*Problem Statement:You are given an array 'Arr' consisting of 'N' distinct integers and a positive integer 'K.
Find out Kth smallest and Kth largest element of the array. It is guaranteed that K is not greater than the size of the array.
Example:
Let prime 'N' = 4,'Arr' be [1, 2, 5, 4] and 'K' = 3 then the elements of this array in ascending order is 
[1, 2, 4, 5].Clearly, the 3rd smallest and largest element of this array is 4 and 2 respectively.
Constraints:
1 <= T <= 50
1 <= N <= 10 ^ 4
1 <= K <= N
- 10 ^ 9 <= Arr[i] <= 10 ^ 9
Where 'T' is the total number of test cases, 'N' is the size of array 'Arr' and Arr[i] is the element of the given array.
Sample Input 1:
2
4 4
5 6 7 2
4 3
1 2 5 4
Sample Output 1:
7 2
4 2
Sample Input 2:
2
1 1
2
5 1
5 4 3 2 1
Sample Output 2:
2 2
1 5
*/
import java.util.ArrayList;
import java.util.*;

public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		Collections.sort(arr);
		ArrayList <Integer> arr1 = new ArrayList<>();
		arr1.add(arr.get(k-1));
		arr1.add(arr.get(n-k));
		return arr1;
	}
}
