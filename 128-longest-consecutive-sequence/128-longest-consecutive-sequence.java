class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashset=new HashSet<>();
        
        for(int i:nums){
            hashset.add(i);
        }
        
        int len=0;
        
        for(int num:nums){
            if(!hashset.contains(num-1)){
                int current=num;
                int streak=1;
                
                while(hashset.contains(current+1)){
                    current=current+1;
                    streak++;
                }
                
                len=Math.max(streak,len);
                
            }
        }
        
        return len;
        
    }
}