class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        Map<Integer,Boolean> map=new HashMap<>();
        
        for(int i=0;i<graph.length;i++){
            if(graph[i].length==0){
                map.put(i,true);
            }
        }
        
        for(int i=0;i<graph.length;i++){
            
            boolean result=dfs(i,graph,new HashSet<Integer>(),map);
            
            map.put(i,result);
            
            
            
        }
        
        List<Integer> res=new ArrayList<>();
        
        for(int i=0;i<graph.length;i++){
            if(map.get(i)==true){
                res.add(i);
            }
        }
        
        return res;
        
    }
    
    private boolean dfs(int curr,int[][] graph,Set<Integer> visited,Map<Integer,Boolean> map){
        
        if(map.containsKey(curr)){
            return map.get(curr);
        }
        
        if(visited.contains(curr)){
            return false;
        }
        
        visited.add(curr);
        
        for(int i:graph[curr]){
            boolean flag=dfs(i,graph,visited,map);
            
            if(flag){
                map.put(i,true);
                
                
            }
            
            else{
                return false;
            }
            
        }
        
        visited.remove(curr);
        
        return true;
        
    }
    
}