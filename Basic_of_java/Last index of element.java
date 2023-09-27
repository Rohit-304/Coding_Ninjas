/*Problem Statement:Take an array with N elements with possibly duplicate elements as the input. The task is to find the
index of the last occurrences of the element x in the array and, if it is not present, return -1.
Detailed explanation (Input/output format)
Input Format:
The first line contains an integer N representing the size of the array.
The next line contains N space-separated integers representing the elements of the array.
The last line contains an integer 'x'.
Output Format:
The only line of the output prints the Index on -1.
Constraints:
1 <= N <=10^3
1 <= arr[i] <= 10^9
1 <= X < N
Sample Input 1:
8 
7 5 2 11 2 43 1 1
2
Sample Output 1:
4
Explanation Of Sample Input 1:
2 is present twice in the input array and the last time it appears is at index 4.
Sample Input 2:
8
7 5 2 11 2 43 11
10
Sample Output 2:-1
Explanation Of Sample Input 2:
10 is not present in the array so the output is -1.
*/
import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<n; i++){
			arr[i]= sc.nextInt();
		}
		int x= sc.nextInt();
		int r=-1;
		for(int i=n-1;i>=0;i--){
			if(arr[i]==x){
				r=i;
				break;
			}
		}
		System.out.print(r);	
	}
}
