//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int X = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.nodeLevel(V,list,X));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Pair  {
    int node;
    int level;
    
    Pair(int node, int level) {
        this.node = node;
        this.level = level;
    }
}
class Solution
{
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        int res = 0;
        
        Queue<Pair> q = new LinkedList<>();
        boolean[] visited = new boolean[V+1];
        
        q.add(new Pair(0, 0));
        visited[0] = true;
        
        while(!q.isEmpty()){
            Pair current = q.poll();
            int node = current.node;
            int level = current.level;
            
            if(node == X){
                res = level;
                return res;
            }
            
            for(int n: adj.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(new Pair(n, level+1));
                }
            }
        }
        return -1;
    }
}