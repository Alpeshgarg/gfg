//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
int ans=0;

for(int j=1;j<m;j++){
    for(int i=0;i<n;i++){
        int mx=Integer.MIN_VALUE;
        if(i-1>=0 && j-1>=0 )
        mx=Math.max(mx,M[i-1][j-1]);
if(j-1>=0 )
        mx=Math.max(mx,M[i][j-1]);
if(i+1<n && j-1>=0 )
        mx=Math.max(mx,M[i+1][j-1]);
        
        M[i][j]+=mx;
        ans=Math.max(ans,M[i][j]);
    }
}
return ans;
    }
}