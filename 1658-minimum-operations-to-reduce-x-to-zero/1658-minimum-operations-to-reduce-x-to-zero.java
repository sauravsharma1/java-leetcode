class Solution {
    public int minOperations(int[] nums, int x) {
     
        int sum=0;
        
        for(int num:nums){
            sum+=num;
        }
        
        int maxl=-1,currsum=0;
        
        for(int l=0,r=0;r<nums.length;r++){
            
            currsum+=nums[r];
            
            while(l<=r&&currsum>sum-x) currsum-=nums[l++];
            
            if(currsum==sum-x) maxl=Math.max(maxl,r-l+1);
            
        }
        
        return maxl==-1?-1:nums.length-maxl;
        
    }
}