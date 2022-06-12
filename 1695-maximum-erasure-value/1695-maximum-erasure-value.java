class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> unique=new HashSet<>();
        
        int start=0,end=0,currsum=0,maxsum=0;
        
        while(end<nums.length){
            int curr=nums[end];
            
            if(!unique.contains(curr)){
                currsum+=curr;
                maxsum=Math.max(maxsum,currsum);
                unique.add(curr);
                end++;
            }
            
            else{
                int del=nums[start];
                unique.remove(del);
                currsum-=del;
                start++;
            }
            
        }
        
        return maxsum;
        
    }
}