class Solution {
    
    private class node{
        private int target;
        private int distance;
        
        public node(int target,int dist){
            this.target=target;
            this.distance=dist;
        }
        
        
    }
    
    public int networkDelayTime(int[][] times, int n, int k) {
        
        PriorityQueue<node> pq=new PriorityQueue<node>((a,b)->a.distance-b.distance);
        
        Map<Integer,Set<node>> map=buildgraph(times);
        
        Set<Integer> visited=new HashSet<>();
        
        pq.offer(new node(k,0));
        
        int totaltime=0;
        
        while(!pq.isEmpty()){
            
            int size=pq.size();
            
            while(size-->0){
                node head=pq.poll();
                if(visited.contains(head.target)){
                    continue;
                }
                visited.add(head.target);
                totaltime=Math.max(head.distance,totaltime);
                
                if(visited.size()==n){
                    return totaltime;
                }
                
                if(map.containsKey(head.target)){
                    for(node children:map.get(head.target)){
                        int childtime=head.distance+children.distance;
                        pq.offer(new node(children.target,childtime));
                    }
                }
                
            }
            
        }
        
        return -1;
        
    }
    
    private Map<Integer,Set<node>> buildgraph(int[][] times){
        
        Map<Integer,Set<node>> map=new HashMap<>();
        
        
        for(int[] time:times){
            
            map.putIfAbsent(time[0],new HashSet<>());
            map.get(time[0]).add(new node(time[1],time[2]));
            
        }
        return map;
    }
    
}