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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int mod;
    static long sequence(int n){
        // code here
        long ans=0;
        mod=1000000007;
        int k=0;
        for(int i=1;i<=n;i++){
            ans=(ans+sol(k+1,k+i))%mod;
            k+=i;
        }
        return ans;
    }
    static long sol(int s,int e){
        long ans=1;
        for(int i=s;i<=e;i++){
            ans=(ans*i)%mod;
        }
        return ans;
    }
}