class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        Map<Integer,List<Integer>> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(i,new ArrayList<>());
        }
        
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            map.get(u).add(v);
            map.get(v).add(u);
            
        }
        
        Set<Integer> visited=new HashSet<>();
        
        return dfs(map,source,destination,visited);
        
    }
    
    public boolean dfs(Map<Integer,List<Integer>> map,int node,int dst,Set<Integer> set){
        
        if(node==dst){
            return true;
        }
        
        if(set.contains(node)){
            return false;
        }
        
        set.add(node);
        
        for(int neigh : map.get(node)){
            if(dfs(map,neigh,dst,set)){
                return true;
            }
        }
        
        return false;
        
    }
    
}