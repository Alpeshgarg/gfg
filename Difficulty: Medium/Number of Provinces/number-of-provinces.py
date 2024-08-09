#User function Template for python3

class Solution:
    def numProvinces(self, adj, V):
        def dfs(node):
            visited.add(node)
            for nei, connected in enumerate(adj[node]):
                if connected and nei not in visited:
                    dfs(nei)
        
        provinces = 0
        visited = set()
        for i in range(V):
            if i not in visited:
                provinces += 1
                dfs(i)
        
        return provinces

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        V=int(input())
        adj=[]
        
        for i in range(V):
            temp = list(map(int,input().split()))
            adj.append(temp);
        
        ob = Solution()
        print(ob.numProvinces(adj,V))
# } Driver Code Ends