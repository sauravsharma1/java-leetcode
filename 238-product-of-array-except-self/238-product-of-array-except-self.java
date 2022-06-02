class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        
        int leftp=1;
        
        for(int i=0;i<nums.length;i++){
            leftp*=nums[i];
            left[i]=leftp;
        }
        
        int rightp=1;
        
        for(int i=nums.length-1;i>=0;i--){
            rightp*=nums[i];
            right[i]=rightp;
        }
        
        for(int i=0;i<nums.length;i++){
            
            int leftproduct=i>=1?left[i-1]:1;
            int rightproduct=i<nums.length-1?right[i+1]:1;
            
            ans[i]=leftproduct*rightproduct;
            
        }
        
        return ans;
        
    }
}