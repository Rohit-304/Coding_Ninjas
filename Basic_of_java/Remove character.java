/*Problem Statement:For a given string (str) and a character X, write a function to remove all the occurrences of X from the given string and return it.
The input string will remain unchanged if the given character(X) doesn't exist in the input string.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.
Sample Input 1:
aabccbaa
a
Sample Output 1:
bccb
Sample Input 2:
xxyyzxx
y
Sample Output 2:
xxzxx
*/
import java.util.* ;
import java.io.*; 
import java.util.Scanner;

class Solution {

    static String removeAllOccurrencesOfChar(String input, char c) {
        // Write your code here
        String temp="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)!=c){
                temp+=input.charAt(i);
            }
        }
        return temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        String ans = removeAllOccurrencesOfChar(input, c);
        System.out.println(ans);
    }
}
