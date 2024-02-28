//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        // Retrieve the length of the string
        int n = s.length();

        // Check if the last three digits are divisible by 8
        if (n >= 3) {
            if (Integer.valueOf(s.substring(n - 3)) % 8 == 0) {
                return 1;
            }
            else {
                return -1;
            }
        }
        else {
            if (Integer.valueOf(s) % 8 == 0) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}