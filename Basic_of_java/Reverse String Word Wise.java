/*Problem Statement:Reverse the given string word-wise. The last word in the given string should come at 1st place, 
the last-second word at 2nd place, and so on.Individual words should remain as it is.
Constraints:
theta <= |S| <= 10 ^ 5 
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
*/
import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        // Write your code here
        String[] words = input.split(" ");
        int i = 0, j = words.length - 1;
        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        String ans = "";
        for (i = 0; i < words.length; i++) {
            ans += (words[i] + " ");
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
