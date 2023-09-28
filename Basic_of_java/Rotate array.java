/*Problem Statement:

Given an array/list 'ARR' of integers and a position 'M'. You have to reverse the array after that position. Example:

We have an array ARR = {1, 2, 3, 4, 5, 6} and M = 3 , considering e based indexing so the subarray {5, 6} will be reversed and our output array will be {1, 2, 3, 4, 6, 5} .

Detailed explanation (Input/output format, Notes

Input Format:

The very first line of input contains an integer 'T' denoting the number of test
 cases.

The first line of every test case contains one integer 'N' where 'N' denotes the number of elements and an integer 'M' which denotes after which position the array has to be reversed.

The second line of every test case contains 'N' space-separated integers which denote the elements of input of array/list.

Output Format:

For each test case, return the required 
You do not need to print anything, it has already been taken care of. Just implement the given function.

Consider 0-based indexing of the array.

Constraints:

1 <= T <= 10 theta<=M<=N<=5^ * 1theta ^ 4 - theta ^ 9 <= ARR[i] <= 10 ^ 9
  Sample Input 1:

26 2

63

1 2 3 4 5 6

52

10 9 8 7 6

Sample Output 1:

1 2 3 4 6 5 10 9 8 67

Explanation 1:

For the first test case, Considering 0-based indexing we have M =
  3 so the subarray[M+1 N-1] has to be reversed. Therefore the required output will be \ 1 , 2, 3, 4, 6, 5}.

For the second test case, Considering e-based indexing we have M = 2 so the

subarray [M+1.. N - 1 ] has to be reversed. Therefore the required output will be \{10, 9, 8, 6, 7\}

Sample Input 2:

27

73

1456677 93 4
  10 4 5 2 3 6 1 3 6

Sample Output 2:

1 4 5 6 7 7 6

10 4 5 2 6 3 1 6 3
*/
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
            a.add(0);
        }
        int p=0;
        for(int i=0;i<=m;i++){
            a.set(p++,arr.get(i));
        }
        for(int j=arr.size()-1;j>m;j--){
            a.set(p++,arr.get(j));
        }
        for(int i=0;i<arr.size();i++){
            arr.set(i,a.get(i));
        }
    }
}
