/*Problem Statement

Write a program to find the total number of a primes number in a given interval. Given two integers S and E, count all primes between

S and E.
Detailed explanation (Input/output format):

Input Format:

The only line of input contains two integers S and E separated by a single space.

Output Format:

The only line of the output prints the total number of primes.

Constraints

1 <= N <= 100

Sample Input 1:

2 10
Sample Output 1:

4

Explanation Of Sample Input 1:

The prime numbers between 2 and 10

are 2,3,5 and 7

Sample Input 2:

25

Sample Output 2:

3
  */
import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime {
	// Write your totalPrime function here
	public int totalPrime(int s,int e){
		int d=0;
		for(int i=s;i<=e;i++){
			int c=0;
			for(int j=1;j<=i;j++){
			if(i%j==0){
				c++;
			}
			}
			if(c==2){
               d++;
			}
		}
		return d;		
	}
}

class Solution {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
