class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        int xor=0;
        
        int xorarr=0;
        
        for(int e:nums){
            xorarr^=e;
        }
        
        for(int i=0;i<=n;i++){
            xor^=i;
        }
        
        return xor^xorarr;
        
    }
}