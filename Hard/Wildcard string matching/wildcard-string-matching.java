//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String wild = in.readLine();
            String pattern = in.readLine();
            
            Solution ob = new Solution();
            boolean flag = ob.match(wild, pattern);
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean match(String wild, String pattern)
    {
        // code here
        int n = wild.length(), m = pattern.length();
        int arr[][] = new int[n+1][m+1];
        arr[n][m] = 1;
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                if(wild.charAt(i)==pattern.charAt(j)){
                    if(arr[i+1][j+1]==1) arr[i][j]=1;
                }
                if(wild.charAt(i)=='*' && (arr[i+1][j]==1 || arr[i+1][j+1]==1)){
                    while(j-->0){
                        arr[i][j] =1;
                    }
                }
                if(wild.charAt(i)=='?' && arr[i+1][j+1]==1){
                    arr[i][j] = 1;
                }
            }
        }
        
        if(arr[0][0]==1) return true;
        return false;
    }
}