//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            ArrayList<String> ans = obj.findPermutation(S);
            Collections.sort(ans);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends

class Solution {
    private void generatePermutations(String p, String up, Set<String> permutations) 
    {
        if (up.isEmpty()) 
        {
            permutations.add(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) 
        {
            String f = p.substring(0, i);
            String l = p.substring(i);
            generatePermutations(f + ch + l, up.substring(1), permutations);
        }
    }
    public ArrayList<String> findPermutation(String s) {
        // Code here
        Set<String> permutations = new HashSet<>();
        generatePermutations("", s, permutations);
        ArrayList<String> result = new ArrayList<>(permutations);
        //Collections.sort(result);
        return result;
    }
}