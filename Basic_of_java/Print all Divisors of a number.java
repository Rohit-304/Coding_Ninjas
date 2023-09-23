/*
Problem Statement

Given an integer 'N' return all the divisors of 'N' in ascending order

For Example:

" N' = 5 .

The divisors of 5 are 1, 5.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
10
Sample Output 1 :
1 2 5 10
Explanation Of Sample Input 1:
The divisors of 10 are 1,2,5,10.
Sample Input 1 :
6
Sample Output 1 :
1 2 3 6
Constraints :
1 <= 'N' <= 10^5
  */

import java.util.ArrayList;
import java.util.List;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> ob = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0)
                ob.add(i);
        }
        return ob;
    }
}

