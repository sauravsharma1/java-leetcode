class Solution {
    public int[] getAverages(int[] nums, int k) {
      
        int n=nums.length,radius=2*k+1;
        
        long pref[]=new long[n+1];
        
        for(int i=0;i<n;i++){
            pref[i+1]=pref[i]+nums[i];
        }
        
        int res[]=new int[n];
        
        Arrays.fill(res,-1);
        
        for(int i=k;i<n-k;i++){
            res[i]=(int)((pref[i+k+1]-pref[i-k])/radius);
        }
        
        return res;
        
    }
}