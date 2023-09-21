/*Problem Statement:You are given an integer 'N', your task is to find and return the N'th Fibonacci number using matrix exponentiation.

Since the answer can be very large, return the answer modulo 10 * 9 + 7

Fibonacci Number Is Calculated Using The Following Formula:

F(n) = F(n - 1) + F(n - 2) , Where, F(1) = F(2) = 1 .

For Example:

4

For ^ prime N' = 5 , the output will be 5.
Detailed explanation (Input/output format, Noti Input Format:

The first line contains a single integer 'T' denoting the number of test cases to be run. Then the test cases follow.

The first line of each test case contains a single integer 'N' representing the integer for which we have to find its equivalent Fibonacci number.

Output Format:

For each test case, print a single integer representing the N'th Fibonacci number.
Return answer modulo 10 ^ 9 + 7 .

Output for each test case will be printed in a separate line.

Note:

You are not required to print anything; it has already been taken care of. Just implement the function.

Constraints:

1 <= T <= 10
1 <= N <= 10 ^ 5
Time Limit: 1 sec.

Sample Input 1:

2

10

7

Sample Output 1:

55

13
Sample Input 2:

243

1

Sample Output 2:

12
*/
import java.util.* ;
import java.io.*; 
public class Solution{
    public static int fibonacciNumber(int n){
        // Write your code here.
        int mod=(int)1e9+7;
        if(n==0)
           return 0;
        if(n<0)
          return 0;
        else{
            int a=0;
            int b=1;
            int c=0;
            for(int i=1;i<n;i++){
                c=a+b;
                a=b;
                b=c;
                if(b>=mod){
                    b-=mod;
                }
            }
            return b;
        }
    }
}
