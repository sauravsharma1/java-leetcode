class Solution {
    public int shortestPathLength(int[][] graph) {
        
        if(graph.length==1)
            return 0;
        
        int finalstate=(1<<graph.length)-1;
        
        Queue<int[]> qu=new LinkedList<>();
        
        for(int i=0;i<graph.length;i++){
            
            qu.add(new int[]{i,(1<<i)});
            
        }
        
        int[][] visited=new int[graph.length][finalstate+1];
        
        int shortestpath=0;
        
        while(!qu.isEmpty()){
            
            int size=qu.size();
            
            shortestpath++;
            
            for(int i=0;i<size;i++){
                int[] head=qu.poll();
                int nodeid=head[0];
                int bitstate=head[1];
                for(int neighbor:graph[nodeid]){
                    int newbitstate=bitstate|(1<<neighbor);
                    
                    if(visited[neighbor][newbitstate]==1){
                        continue;
                    }
                    
                    visited[neighbor][newbitstate]=1;
                    
                    if(newbitstate==finalstate)
                        return shortestpath;
                    
                    qu.add(new int[]{neighbor,newbitstate});
                    
                }
            }
            
        }
        
        return -1;
        
    }
}