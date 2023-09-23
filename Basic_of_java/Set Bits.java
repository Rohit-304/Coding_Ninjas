/* Problem Statement 
  
  Suggest Edit Write a program to count the number 
  
  of 1's in the binary representation of an integer.
   Sample Input 1:
9
Sample Output 1:
2
Explanation Of Sample Input 1:
Binary Representation of 9 is 1001.
Sample Input 2:
13
Sample Output 2:
3

*/

import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
		int count=0;
		while(n>0){
			count =count + (n&1);
			n=n>>1;
		}
		return count;
	}
}
