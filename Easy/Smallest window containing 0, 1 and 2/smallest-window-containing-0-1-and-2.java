//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int ans=Integer.MAX_VALUE,z=-1,o=-1,t=-1,max=0,min=0;
        
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='0')z=i;
            else if(S.charAt(i)=='1')o=i;
            else t=i;
            if(z!=-1 && o!=-1 && t!=-1)
            {
                max=Math.max(z,Math.max(o,t));
                min=Math.min(z,Math.min(o,t));
                
                ans=Math.min(ans,max-min+1);
                
            }
        }
        
        return ans==Integer.MAX_VALUE?-1:ans;
        
    }
};