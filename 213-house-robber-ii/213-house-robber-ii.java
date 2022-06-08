class Solution {
    public int rob(int[] nums) {
        
        int n=nums.length;
        
        if(nums.length==0){
            return 0;
        }
        
        if(nums.length==1){
            return nums[0];
        }
        
        int[] dp=new int[n];
        
        Arrays.fill(dp,-1);
        
        int[] temp1=new int[n-1];
        int[] temp2=new int[n-1];
        
        for(int i=0;i<nums.length;i++){
            if(i!=0) temp1[i-1]=nums[i];
            if(i!=nums.length-1) temp2[i]=nums[i];
        }
        
        int ans1=solve(n-2,temp1,dp);
        
        Arrays.fill(dp,-1);
        
        int ans2=solve(n-2,temp2,dp);
        
        return Math.max(ans1,ans2);
        
    }
    
    private int solve(int i,int[] arr,int [] dp){
        
        if(i<0){
            return 0;
        }
        
        if(dp[i]!=-1){
            return dp[i];
        }
        
        int take=arr[i]+solve(i-2,arr,dp);
        
        int notake=solve(i-1,arr,dp);
        
        return dp[i]=Math.max(take,notake);
        
    }
    
}