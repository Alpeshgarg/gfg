//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.countSub(a, n) ? 1:0);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public boolean countSub(long arr[], long n)
    {
        // Your code goes here
        for(int i = 0; i < n / 2; i++){
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;
            
            if(leftChild < n && arr[i] < arr[leftChild]){
                return false;
            }
            
           
            if(rightChild < n && arr[i] < arr[rightChild]){
                return false;
            }
        }
        return true;
    }
}