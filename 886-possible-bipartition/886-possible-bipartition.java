class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        
        int[] color=new int[n+1];
        
        List<Integer>[] graph=new List[n+1];
        
        for(int i=1;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        
        for(int[] d:dislikes){
            graph[d[0]].add(d[1]);
            graph[d[1]].add(d[0]);
        }
        
        for(int i=1;i<=n;i++){
            if(color[i]==0){
            LinkedList<Integer> queue=new LinkedList<>();
            
                queue.add(i);
                
                color[i]=1;
                
                while(queue.size()>0){
                    int top=queue.poll();
                    for(int neighbor:graph[top]){
                        if(color[neighbor]==color[top]){
                            return false;
                        }
                        if(color[neighbor]==0){
                            color[neighbor]=-color[top];
                            queue.add(neighbor);
                        }
                    }
                }
            
            }
            
            
        }
        
        return true;
        
    }
}