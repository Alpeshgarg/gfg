//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
	
    int findK(int A[][], int n, int m, int k)
    {
         int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int count = 0;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                count++;
                if (count == k) {
                    return A[top][i];
                }
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                count++;
                if (count == k) {
                    return A[i][right];
                }
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    count++;
                    if (count == k) {
                        return A[bottom][i];
                    }
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    count++;
                    if (count == k) {
                        return A[i][left];
                    }
                }
                left++;
            }
        }

        return -1;
    }
}