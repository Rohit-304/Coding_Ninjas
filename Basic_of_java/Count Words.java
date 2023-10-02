/*
Problem Statement:

For a given input string (str), find and return the total number of words present in it.

It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.

Detailed explanation (Input/output format, Notes, Images)

Constraints:

0 <= N <= 10 ^ 3

Where N is the length of the input string. 

Time Limit: 1 sec

Sample Input 1:
Coding Ninjas!
Sample Output 1: 
2
Sample Input 2:
this is a sample string
Sample Output 2:
5
*/

import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
    static int  countWords(String input) {
        // Write your code here
        int c=1;
        for(int i=0;i<input.length()-1;i++){
            if((input.charAt(i)==' ')&&(input.charAt(i+1)!=' ')){
                c++;
            }
        }
        return c;
    }
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
		
	}
}
