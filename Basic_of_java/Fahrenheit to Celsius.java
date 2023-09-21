/*
Problem Statement:Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E), and Step Size (W), you need to 
convert all Fahrenheit values from Start to End at the gap of W into their corresponding Celsius values and print the table.

Note:
Print the floor of the Celsius values if they are non-negative else print its ceil value.

Detailed explanation (Input/output format, Notes, love Input Format:

The first line of input contains a single integer S, representing the Start Fahrenheit Value.

The second line of input contains a single integer E, representing the end Fahrenheit Value.
The third line of input contains a single Integer W, representing the Step Size.

Output Format:

Print the Fahrenheit and corresponding tab- separated (^ prime prime backslash t ^ prime prime ) Celcius value in a single line.

Output for every Fahrenheit and corresponding celsius value will be printed in a separate line.

Constraints:

theta <= S <= 80 
S <= E <= 900
theta <= W <= 4theta

Sample Input 1:

100

20

Sample Output 1:

0 -17

20 -6

40 4

60 15

80 26

100 37
Sample Input 2:

20

119

13

Sample Output 2:

20 -6

33 0

46 7

59

15

72

22

85

29

98

36

111 43
*/


import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner ob=new Scanner(System.in);
		int S=ob.nextInt();
		int E=ob.nextInt();
		int W=ob.nextInt();
		int C;
        for(int i=S;i<=E;i=i+W){
			C=(5*(i-32))/9;
			if(C>0){
			   C=(int)Math.floor(C);
               System.out.print(i+" "+C+"\n");
			}
			else{
			   C=(int)Math.ceil(C);
			   System.out.print(i+" "+C+"\n");
			}
		}
	}
}
