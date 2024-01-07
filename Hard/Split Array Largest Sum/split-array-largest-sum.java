//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int low = 0, high = 0;
        
        for(int m : arr) {
            low = Math.max(low , m);
            high += m;
        }
        
        while(low < high) {
            int mid = (low + high) / 2;
            int count = partition(arr , mid);
            
            if(count <= K) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        
        return low;
    }
    
    static int partition(int arr[] , int K) {
        int sum = 0 , count = 0;
        
        for(int m  :arr) {
            if(sum + m <= K) {
                sum += m;
            }
            else {
                count++;
                sum = m;
            }
        }
        
        
        return sum > 0 ? count + 1 : count;
    }
};