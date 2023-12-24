//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = price[i]*100000+(i+1);
        }
        
        //sort the array
        Arrays.sort(arr);
        
        int ans = 0;
        for(int i=0;i<n;i++){
            int currStockPrice = arr[i]/100000;
            int currDay = arr[i]%100000;

            int possible = Math.min(k/currStockPrice,currDay);
            
            ans += possible;
            k -= currStockPrice*possible;
        }
        return ans;
    }
}