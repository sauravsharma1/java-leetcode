class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int lis[]=new int[nums.length];
        
        lis[0]=1;
        
        for(int i=1;i<lis.length;i++){
            
            
            lis[i]=1;
            
            for(int j=0;j<i;j++){
                
                if(nums[j]<nums[i]&&lis[i]<lis[j]+1){
                    lis[i]=lis[j]+1;
                }
                
            }
            
        }
        
        int maxi=0;
        
        for(int i=0;i<lis.length;i++){
        maxi=Math.max(maxi,lis[i]);
        }
        
        return maxi;
        
    }
}