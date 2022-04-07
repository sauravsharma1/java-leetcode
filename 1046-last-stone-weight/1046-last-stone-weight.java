class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((a,b)->(b-a));
        
        for(int stone:stones){
            pq.offer(stone);
        }
        
        while(pq.size()>1){
            
            int largestEl=pq.poll();
            
            int second=pq.poll();
            
            if(largestEl==second){
                continue;
            }
            
            else{
                int diff=largestEl-second;
                
                pq.offer(diff);
                
            }
            
        }
        
        return pq.size()==0?0:pq.poll();
        
    }
}