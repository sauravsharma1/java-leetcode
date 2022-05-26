class Solution {
    public int jump(int[] nums) {
        
        Queue<Integer> queue=new LinkedList<>();
        
        boolean[] visited=new boolean[nums.length];
        
        queue.offer(0);
        
        int level=0;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            while(size-->0){
                Integer curri=queue.poll();
                
                if(visited[curri]){
                    continue;
                }
                
                if(curri==nums.length-1){
                    return level;
                }
                
                int maxi=Math.min(curri+nums[curri],nums.length-1);
                
                while(maxi>curri){
                    if(!visited[maxi]){
                        queue.offer(maxi);
                    }
                    maxi--;
                }
                
                visited[curri]=true;
                
            }
            
            level++;
            
        }
        
        return level;
        
    }
}