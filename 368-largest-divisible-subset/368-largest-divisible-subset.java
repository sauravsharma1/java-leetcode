class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        
        int n=nums.length;
        
        int[] dp=new int[n];
        
        int[] pre=new int[n];
        Arrays.sort(nums);
        
        Arrays.fill(dp,1);
        
        int max=0,index=-1;
        
        
        for(int i=0;i<n;i++){
            pre[i]=-1;
            
            for(int j=i-1;j>=0;j--){
                
                if(nums[i]%nums[j]==0){
                    if(1+dp[j]>dp[i]){
                        dp[i]=dp[j]+1;
                        pre[i]=j;
                    }
                }
                
            }
            
            if(dp[i]>max){
                max=dp[i];
                index=i;
            }
        }
        
        List<Integer> res=new ArrayList<>();
        
        while(index!=-1){
            res.add(nums[index]);
            index=pre[index];
        }
        
        return res;
        
    }
}