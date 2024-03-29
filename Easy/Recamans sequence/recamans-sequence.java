//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.recamanSequence(n);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        
        arr.add(0);
        set.add(0);
        
        for(int i=1;i<n;i++){
            int ans=arr.get(i-1)-i;
            if(ans>0 && !set.contains(ans))
            {
                arr.add(ans);
                set.add(ans);
            }
            else{
                arr.add(arr.get(i-1)+i);
                set.add(arr.get(i-1)+i);
            }
        }
        return arr;
    }
}