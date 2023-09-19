/*
 
Problem Statement

Suggest Edit

Ninja is shifting to a new place named NinjaGram. To take admission to the new school, the teacher gives him a sentence and asks him to check whether the sentence is a pangram.

A word or a sentence is called a pangram if it contains all

the English alphabet letters. Since Ninja is new to programming, he doesn't have much experience; he asks you to solve the problem. Can you help Ninja figure out whether the sentence is a pangram?

Detailed explanation (Input/output format, Notes, Image

Constraints:

1<= T <= 50

1<= n <= 10^4

Where 'T' is the number of test cases, 'n' denotes the number of characters in the string.

Time Limit: 1 sec

*/


import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static boolean ninjaGram(String str) {

		// Write your code here
		HashMap<Character,Integer> hm =new HashMap<>();
		if(str.length()<26)
			return false;
		else{
			for(int i=0; i<str.length(); i++){
				hm.put(Character.toLowerCase(str.charAt(i)),hm.getOrDefault(str.charAt(i),0)+1);
			}
		}
	return hm.size()==26?true:false;
	}
}



