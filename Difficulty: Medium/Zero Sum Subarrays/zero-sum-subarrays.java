//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline

        while (t-- > 0) {
            String input = sc.nextLine(); // Input array as a space-separated string
            String[] inputArray = input.split(" ");
            int[] arr = new int[inputArray.length];

            // Parse the input array
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.findSubarray(arr));
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public int findSubarray(int[] arr) {
        int n = arr.length;
        
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for(int i=0; i<n; i++) {
            
            sum += arr[i];
            
            if(map.containsKey(sum)) {
                int temp = map.get(sum);
                count += temp;
                map.put(sum, temp + 1);
            } else {
                map.put(sum, 1);
            }
            
            if(sum == 0) count++;
        }
        
        return count;
    }
}
