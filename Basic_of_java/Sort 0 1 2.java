/*Problem Statement:You have been given an integer array/list(ARR) of size 'N' It only contains Os, 1s and 2s. 
Write a solution to sort this array/list.
Note:Try to solve the problem in 'Single Scan'. 'Single Scan' refers to iterating over the array/list just once
or to put it in other words, you will be visiting each element in the array / list just once.
Constraints:
1<= T <= 10
1 <= N <= (5(10 ^ 5))
theta <= ARR[i]  <= 2
Where 'N' is the size of the given array/list.And, ARR[i] denotes the i-th element in the array/list.
Sample Input 1:
2
6
0 1 2 2 1 0
7
0 1 2 1 2 1 2
Sample Output 1:
0 0 1 1 2 2
0 1 1 1 2 2 2
Sample Input 2:
2
7
2 2 2 1 1 1 0
6
2 1 2 0 1 0
Sample Output 2:
0 1 1 1 2 2 2
0 0 1 1 2 2
*/
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int i=0;
        int left=0;
        int right=arr.length-1;
        int temp;
        while(i<=right){
            if(arr[i]==0){
                temp=arr[i];
                arr[i]=arr[left];
                arr[left]=temp;
                i++;
                left++;
            }
            else if(arr[i]==2){
                temp=arr[i];
                arr[i]=arr[right];
                arr[right]=temp;
                right--;
            }
            else{
                i++;
            }
        }
    }
}
