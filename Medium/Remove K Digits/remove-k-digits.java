//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeKdigits(String S, int K) {
        int n=S.length();
        if(K==n){
            return "0";
        }
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<n){
            while(K>0 && res.length()>0 && res.charAt(res.length()-1)>S.charAt(i)){
                res.deleteCharAt(res.length()-1);
                K--;
            }
            res.append(S.charAt(i));
            i++;
        }
        while(K>0){
            res.deleteCharAt(res.length()-1);
            K--;
        }
        int p=0;
        while(p<res.length() && res.charAt(p)=='0'){
            p++;
        }
        res.delete(0,p);
        if(res.length()==0){
            return "0";
        }else{
            return res.toString();
        }
        // code here
    }
}